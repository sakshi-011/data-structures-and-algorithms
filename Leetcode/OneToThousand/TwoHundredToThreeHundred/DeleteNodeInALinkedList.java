package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import Leetcode.ListNode;

public class DeleteNodeInALinkedList {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5, new ListNode(1));
        head.next.next.next = new ListNode(9);

        ListNode node = head.next;

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
        deleteNode(node);
        temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
