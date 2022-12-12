package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import Leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode temp=head, prev = null, next = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        ListNode head = new ListNode(Integer.valueOf(str[0]));
        ListNode temp = head;
        for(int i=1;i<str.length;i++){
            temp.next=new ListNode(Integer.valueOf(str[i]));
            temp=temp.next;
        }
        temp = reverseList(head);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }

}
