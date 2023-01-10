package Leetcode.OneToThousand.OneToHundred;

import Leetcode.TreeNode;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(4);
        r.right = null;
        System.out.println(isSameTree(p,q));
        System.out.println(isSameTree(p,r));
    }

}
