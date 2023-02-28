package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import Leetcode.TreeNode;

public class FindDuplicateSubtrees{

    public static String preOrder(TreeNode root, Map<String,List<TreeNode>> m){
        if(root == null)
            return "";
        String s = "(" + preOrder(root.left,m) + root.val + preOrder(root.right,m) + ")";
        if(!m.containsKey(s))
            m.put(s,new ArrayList<TreeNode>());
        m.get(s).add(root);
        return s;
    }

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String,List<TreeNode>> map = new HashMap<>();
        preOrder(root, map);
        for(List<TreeNode> list : map.values())
            if(list.size() > 1)
                ans.add(list.get(0));
        return ans;
    }

    public static void printTreeNode(TreeNode node){
        if(node == null)
            return;
        System.out.print(node.val+" ");
        printTreeNode(node.left);
        printTreeNode(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), null);
        root.right = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        root.right.left.left = new TreeNode(4);
        List<TreeNode> ans = findDuplicateSubtrees(root);
        for (TreeNode node : ans) {
            printTreeNode(node);
            System.out.println();
        }
    }

}
