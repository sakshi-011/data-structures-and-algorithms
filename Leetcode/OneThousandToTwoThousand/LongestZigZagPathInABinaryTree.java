package Leetcode.OneThousandToTwoThousand;

import Leetcode.TreeNode;

public class LongestZigZagPathInABinaryTree {

    private static int[] dfs(TreeNode root) {
        if (root == null)
            return new int[]{-1, -1, -1};
        int[] left = dfs(root.left), right = dfs(root.right);
        int res = Math.max(Math.max(left[1], right[0]) + 1, Math.max(left[2], right[2]));
        return new int[]{left[1] + 1, right[0] + 1, res};
    }

    public static int longestZigZag(TreeNode root) {
        return dfs(root)[2];
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        root.left.right = new TreeNode(1, new TreeNode(1, null, new TreeNode(1)), new TreeNode(1));
        System.out.println(longestZigZag(root));
    }

}
