package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

public class SumRootToLeafNumbers {

    public static int dfs(TreeNode node, int ans){
        if(node == null)
            return 0;
        int s = ans*10 + node.val;
        if(node.left == null && node.right == null)
            return s;
        return dfs(node.left, s) + dfs(node.right, s);
    }

    public static int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(9), new TreeNode(0));
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        System.out.println(sumNumbers(root));
    }
}
