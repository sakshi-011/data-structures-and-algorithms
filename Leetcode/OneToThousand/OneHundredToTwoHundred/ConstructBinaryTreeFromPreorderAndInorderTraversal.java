package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private static Map<Integer,Integer> inorderMap;
    private static int preorderIndex;

    public static TreeNode ArrayToTree(int[] preorder,int left, int right){
        if(left > right)
            return null;

        int val = preorder[preorderIndex++];
        TreeNode root = new TreeNode(val);
        root.left = ArrayToTree(preorder,left,inorderMap.get(val) - 1);
        root.right = ArrayToTree(preorder,inorderMap.get(val) + 1,right);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i],i);
        }
        preorderIndex = 0;
        return ArrayToTree(preorder,0,preorder.length-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] preorder = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            preorder[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] inorder = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            inorder[i] = Integer.valueOf(str[i]);
        }
        TreeNode root = buildTree(preorder,inorder);
    }

}
