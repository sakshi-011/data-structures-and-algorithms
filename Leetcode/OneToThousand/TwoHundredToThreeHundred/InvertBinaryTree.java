package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import Leetcode.TreeNode;
public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void printTree(TreeNode root){
        if(root == null)
            return;
        printTree(root.left);
        System.out.print(root.val+" ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        printTree(invertTree(root));
    }

}
