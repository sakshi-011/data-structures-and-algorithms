package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import Leetcode.TreeNode;

public class CountGoodNodesInBinaryTree {

    public static int dfs(TreeNode node, int currMax) {
        if(node == null)
            return 0;
        int count = 0;
        if(node.val >= currMax)
            count = 1;
        currMax = Math.max(currMax, node.val);
        count += dfs(node.left, currMax);
        count += dfs(node.right, currMax);
        return count;
    }

    public static int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4));
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        System.out.println(goodNodes(root));
    }
}
