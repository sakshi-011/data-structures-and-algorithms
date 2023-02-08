package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.HashMap;
import javafx.util.Pair;

public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                list.add(queue.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }

    /*
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Deque<Pair<TreeNode,Integer>> queue = new ArrayDeque<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        map.computeIfAbsent(0,a -> new ArrayList<>()).add(root.val);
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair<TreeNode,Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int val = pair.getValue();
            if(node.left != null){
                map.computeIfAbsent(val+1,a -> new ArrayList<>()).add(node.left.val);
                queue.add(new Pair(node.left, val+1));
            }
            if(node.right != null){
                map.computeIfAbsent(val+1,a -> new ArrayList<>()).add(node.right.val);
                queue.add(new Pair(node.right,val+1));
            }
        }
        ans = new ArrayList<>(map.values());
        return ans;
    }
     */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20));
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrder(root);
        for(List<Integer> l : list)
            System.out.println(l.toString());
    }

}
