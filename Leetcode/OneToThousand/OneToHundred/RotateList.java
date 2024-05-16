package Leetcode.OneToThousand.OneToHundred;

import Leetcode.ListNode;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null)
                return head;
            ListNode temp = head, ans;
            int n = 1;
            while(temp.next != null){
                n++;
                temp = temp.next;
            }
            temp.next = head;
            k %= n;
            temp = head;
            for(int i = 0; i < n - k - 1; i++){
                temp = temp.next;
            }
            ans = temp.next;
            temp.next = null;
            return ans;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode rotatedList = rotateRight(head,2);
        while(rotatedList != null){
            System.out.println(rotatedList.val);
            rotatedList = rotatedList.next;
        }
    }
}
