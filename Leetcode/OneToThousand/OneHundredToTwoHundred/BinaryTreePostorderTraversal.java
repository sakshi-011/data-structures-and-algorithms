package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.TreeNode;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreePostorderTraversal {

    static List<Integer> ans = new ArrayList<>();;

    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return ans;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> ans = postorderTraversal(root);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
