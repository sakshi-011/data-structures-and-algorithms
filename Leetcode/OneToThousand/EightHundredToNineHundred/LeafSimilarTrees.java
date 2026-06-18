package Leetcode.OneToThousand.EightHundredToNineHundred;

import Leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public static void dfs(TreeNode node, List<Integer> leafValues){
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.val);
            dfs(node.left, leafValues);
            dfs(node.right, leafValues);
        }
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3, new TreeNode(5), new TreeNode(1));
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        TreeNode root2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)), new TreeNode(1));
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2, new TreeNode(9), new TreeNode(8));
        System.out.println(leafSimilar(root1, root2));
    }

}
