package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

public class SymmetricTree {

    public static boolean isSymmetricRecur(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isSymmetricRecur(left.left,right.right) && isSymmetricRecur(left.right,right.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetricRecur(root.left,root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }

}
