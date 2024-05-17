package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

public class BalancedBinaryTree {

    public static boolean ans = true;

    public static int depth(TreeNode root){
        if(root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left - right) > 1)
            ans = false;
        return Math.max(left,right) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        depth(root);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(isBalanced(root));
        root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left.left = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        root.left.right = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
