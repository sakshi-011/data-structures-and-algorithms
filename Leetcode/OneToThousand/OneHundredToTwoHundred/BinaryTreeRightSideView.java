package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    static List<Integer> list = new ArrayList();

    public static List<Integer> bfs(TreeNode node){
        if(node == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int nodesAtCurrLevel = queue.size(), rightmostVal = 0;

            for(int i = 0; i < nodesAtCurrLevel; i++){
                TreeNode currentNode = queue.poll();
                rightmostVal = currentNode.val;

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            list.add(rightmostVal);
        }
        return list;
    }

    public static List<Integer> rightSideView(TreeNode root) {
        return bfs(root);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        root.right.right = new TreeNode(4);
        List<Integer> ans = rightSideView(root);
        for(int l : ans)
            System.out.print(l+" ");
    }
}
