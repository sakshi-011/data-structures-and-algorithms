package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }

    /* BFS solution
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            count++;
        }
        return count;
    }
    */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20,new TreeNode(15),new TreeNode(7));
        System.out.println(maxDepth(root));
    }

}
