package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

import Leetcode.ListNode;

public class DoubleANumberRepresentedAsALinkedList {

    public static ListNode reverseList(ListNode head){
        if(head.next == null)
            return head;
        ListNode curr = head, next = null, prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode doubleIt(ListNode head) {
        head = reverseList(head);
        ListNode curr = head, last = null;
        int rem = 0, carry = 0;
        while(curr != null){
            rem = (curr.val * 2 + carry) % 10;
            carry = (curr.val * 2 + carry) / 10;
            curr.val = rem;

            if(curr.next == null)
                last = curr;

            curr = curr.next;
        }
        if(carry != 0)
            last.next = new ListNode(carry);
        return reverseList(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode ans = doubleIt(head);
        while(ans != null){
            System.out.print(ans.val+", ");
            ans = ans.next;
        }
    }
}
