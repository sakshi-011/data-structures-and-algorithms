package Leetcode.OneToThousand.OneToHundred;

import Leetcode.TreeNode;

public class ValidateBinarySearchTree {

    private static Integer prev;

    public static boolean inorder(TreeNode root) {
        if(root == null)
            return true;
        if(!inorder(root.left))
            return false;
        if(prev != null && root.val <= prev)
            return false;
        prev = root.val;
        return inorder(root.right);
    }

    public static boolean isValidBST(TreeNode root) {
        prev = null;
        return inorder(root);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,new TreeNode(1),new TreeNode(4));
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.print(isValidBST(root));
    }

}
