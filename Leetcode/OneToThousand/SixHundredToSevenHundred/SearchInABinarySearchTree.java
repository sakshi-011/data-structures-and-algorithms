package Leetcode.OneToThousand.SixHundredToSevenHundred;

import Leetcode.TreeNode;

public class SearchInABinarySearchTree {

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(root.val == val){
            return root;
        } else if(root.val < val){
            return searchBST(root.right, val);
        } else
            return searchBST(root.left, val);
    }

    public static void printPreOrder(TreeNode root){
        if(root == null)
            return;

        System.out.print(root.val+",");

        if(root.left != null)
            printPreOrder(root.left);
        if(root.right != null)
            printPreOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        printPreOrder(root);
        System.out.println();
        TreeNode res = searchBST(root, 2);
        printPreOrder(res);
    }
}
