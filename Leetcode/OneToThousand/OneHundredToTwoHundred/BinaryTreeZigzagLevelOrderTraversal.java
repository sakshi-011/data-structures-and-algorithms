package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean reverse = false;
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                list.add(q.poll().val);
            }
            if(reverse)
                Collections.reverse(list);
            ans.add(list);
            reverse = !reverse;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20));
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = zigzagLevelOrder(root);
        for(List<Integer> l : list)
            System.out.println(l.toString());
    }

}
