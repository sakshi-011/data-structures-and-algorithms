package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreePreorderTraversal {

    static List<Integer> l = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return l;
        }
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> ans = preorderTraversal(root);
        for(int x : ans) {
            System.out.println(x);
        }
    }

}