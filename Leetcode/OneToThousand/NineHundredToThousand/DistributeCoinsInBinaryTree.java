package Leetcode.OneToThousand.NineHundredToThousand;

import Leetcode.TreeNode;

public class DistributeCoinsInBinaryTree {

    private static int moves;

    public static int distributeCoins(TreeNode root) {
        moves = 0;
        dfs(root);
        return moves;
    }

    private static int dfs(TreeNode current) {
        if (current == null)
            return 0;

        int left = dfs(current.left);
        int right = dfs(current.right);

        moves += Math.abs(left) + Math.abs(right);

        return (current.val - 1) + left + right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(0), new TreeNode(0));
        System.out.println(distributeCoins(root));
    }
}
