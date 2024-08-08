package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;

public class ReorderList {

    public static void reorderList(ListNode head) {

        if(head==null||head.next==null)
            return;

        ListNode p1=head, p2=head;
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode preMiddle = p1, preCurrent = p1.next;
        while(preCurrent.next != null){
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        p1 = head;
        p2 = preMiddle.next;
        while(p1 != preMiddle){
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        head.next.next.next = new ListNode(4, new ListNode(5));
        reorderList(head);
        while(head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
