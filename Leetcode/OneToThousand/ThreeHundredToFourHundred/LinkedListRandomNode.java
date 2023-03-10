package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import Leetcode.ListNode;

public class LinkedListRandomNode {

    private ListNode head;
    private int size;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        ListNode temp = head;
        size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
    }

    public int getRandom() {
        int rand = (int)(Math.random() * size);
        ListNode temp = head;
        for(int i = 0; i < rand; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2, new ListNode(1));
        head.next.next = new ListNode(4, new ListNode(3));
        LinkedListRandomNode l = new LinkedListRandomNode(head);
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
        System.out.println(l.getRandom());
    }
}
