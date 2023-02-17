package Leetcode.OneToThousand.SevenHundredToEightHundred;

import Leetcode.TreeNode;
public class MinimumDistanceBetweenBSTNodes {

    static int min = Integer.MAX_VALUE;
    static TreeNode prev;

    public static void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        if(prev != null){
            min = Math.min(min,root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }

    public static int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        root.right = new TreeNode(6);
        System.out.println(minDiffInBST(root));
    }

}
