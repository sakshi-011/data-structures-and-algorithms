package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

import Leetcode.TreeNode;

public class DeleteLeavesWithAGivenValue {

    public static void printTreeInOrder(TreeNode root){
        if(root == null)
            return;
        printTreeInOrder(root.left);
        System.out.print(root.val+" ");
        printTreeInOrder(root.right);
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        int target = 2;
        printTreeInOrder(root);
        TreeNode ans = removeLeafNodes(root, target);
        printTreeInOrder(ans);
    }
}
