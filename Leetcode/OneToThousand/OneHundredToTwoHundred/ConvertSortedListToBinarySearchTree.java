package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;
import Leetcode.TreeNode;

public class ConvertSortedListToBinarySearchTree {

    public static TreeNode toBST(ListNode head, ListNode tail){
        ListNode slow = head, fast = head;
        if(head == tail)
            return null;
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode t = new TreeNode(slow.val);
        t.left = toBST(head,slow);
        t.right = toBST(slow.next,tail);
        return t;
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        return toBST(head,null);
    }

    public static void inorder(TreeNode tree){
        if(tree == null)
            return;
        System.out.print(tree.val+" ");
        inorder(tree.left);
        inorder(tree.right);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-10, new ListNode(-3));
        head.next.next = new ListNode(0, new ListNode(5, new ListNode(9)));
        TreeNode tree = sortedListToBST(head);
        inorder(tree);
    }

}
