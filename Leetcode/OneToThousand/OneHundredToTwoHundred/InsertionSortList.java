package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;

public class InsertionSortList {

    public static ListNode insertionSortList(ListNode head) {
        if( head == null || head.next == null){
            return head;
        }
        ListNode start = new ListNode(0, head);
        ListNode temp = head, curr = head;
        while(head != null && head.next != null) {
            if(head.val <= head.next.val){
                head = head.next;
            } else {
                temp = head.next;
                curr = start;
                while(curr.next.val < temp.val)
                    curr = curr.next;
                head.next = temp.next;
                temp.next = curr.next;
                curr.next = temp;
            }
        }
        return start.next;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode sortedList = insertionSortList(root1);
        while(sortedList != null) {
            System.out.print(sortedList.val+" ");
            sortedList = sortedList.next;
        }
    }
}
