package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import Leetcode.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public static TreeNode helper(int[] nums, int l, int r){
        if(l > r)
            return null;
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,l,mid-1);
        node.right = helper(nums,mid+1, r);
        return node;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        TreeNode root = helper(nums,0,nums.length-1);
        return root;
    }

    public static void preorder(TreeNode t){
        if(t == null)
            return;
        System.out.print(t.val+" ");
        preorder(t.left);
        preorder(t.right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        TreeNode t = sortedArrayToBST(nums);
        preorder(t);
    }
}
