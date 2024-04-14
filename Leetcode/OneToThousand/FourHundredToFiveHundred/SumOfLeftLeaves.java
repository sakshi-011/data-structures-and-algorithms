package Leetcode.OneToThousand.FourHundredToFiveHundred;

import Leetcode.TreeNode;

public class SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int sum = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9),null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(sumOfLeftLeaves(root));
    }
}
