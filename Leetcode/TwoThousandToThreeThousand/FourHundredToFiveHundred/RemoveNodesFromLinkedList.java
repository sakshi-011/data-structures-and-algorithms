package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import Leetcode.ListNode;

public class RemoveNodesFromLinkedList {

    public static ListNode reverseList(ListNode head){
        ListNode next = null, prev = null;
        ListNode curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode removeNodes(ListNode head) {
        if(head.next == null)
            return head;
        head = reverseList(head);

        int maximum = 0;
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            maximum = Math.max(maximum, temp.val);
            if (temp.val < maximum) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }

        return reverseList(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
        ListNode temp = removeNodes(head);;
        while(temp != null){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
    }
}
