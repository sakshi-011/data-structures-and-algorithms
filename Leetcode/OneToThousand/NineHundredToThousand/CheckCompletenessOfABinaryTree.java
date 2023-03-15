package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Queue;
import java.util.LinkedList;
import Leetcode.TreeNode;

public class CheckCompletenessOfABinaryTree {

    public static boolean isCompleteTree(TreeNode root) {
        boolean end = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur == null)
                end = true;
            else{
                if(end)
                    return false;
                queue.add(cur.left);
                queue.add(cur.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, new TreeNode(6), null);
        System.out.println(isCompleteTree(root));
    }

}
