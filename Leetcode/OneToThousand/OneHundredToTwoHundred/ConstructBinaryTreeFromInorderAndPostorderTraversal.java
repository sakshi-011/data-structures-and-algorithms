package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;
import java.util.Scanner;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private static TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);

        return root;
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public static void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] inorder = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            inorder[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] postorder = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            postorder[i] = Integer.valueOf(str[i]);
        }
        TreeNode root = buildTree(inorder,postorder);
        inorder(root);
    }

}
