package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import Leetcode.TreeNode;

public class EvaluateBooleanBinaryTree {

    public static boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val != 0;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        boolean ans;
        if (root.val == 2) {
            ans = left | right;
        } else {
            ans = left & right;
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        System.out.println(evaluateTree(root));
    }
}
