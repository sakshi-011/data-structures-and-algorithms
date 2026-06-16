package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import Leetcode.ListNode;

public class DeleteTheMiddleNodeOfALinkedList {

    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = slow.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode temp = list;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("\nmiddle node deleted ");
        ListNode modifiedList = deleteMiddle(list);
        temp = modifiedList;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
}
