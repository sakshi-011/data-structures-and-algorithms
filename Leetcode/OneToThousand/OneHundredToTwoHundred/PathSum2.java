package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class PathSum2 {

    static List<List<Integer>> l;
    static int sum;
    public static void getPaths(TreeNode node) {
        int path[] = new int[1000];
        getPathsRecur(node, path, 0);
    }

    public static void getPathsRecur(TreeNode node, int path[], int pathLen) {
        if (node == null)
            return;
        path[pathLen] = node.val;
        pathLen++;

        if (node.left == null && node.right == null)
            setPath(path, pathLen);
        else {
            getPathsRecur(node.left, path, pathLen);
            getPathsRecur(node.right, path, pathLen);
        }
    }

    public static void setPath(int ints[], int len) {
        int i, s=0;
        List<Integer> list = new ArrayList<Integer>();
        for (i = 0; i < len; i++) {
            list.add(ints[i]);
            s+=ints[i];
        }
        if(sum==s){
            l.add(list);
        }
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        l = new ArrayList<List<Integer>>();
        sum = targetSum;
        getPaths(root);
        return l;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int targetSum = 22;
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        List<List<Integer>> ans = pathSum(root,targetSum);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
