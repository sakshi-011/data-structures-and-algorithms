package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class OddEvenLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head,even=head.next,mid=head.next;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=mid;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        ListNode head = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < str.length; i++) {
            if(head==null)
                head = new ListNode(Integer.parseInt(str[i]));
            else {
                temp.next = new ListNode(Integer.parseInt(str[i]));
                temp=temp.next;
            }
        }
        temp = oddEvenList(head);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
