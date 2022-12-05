package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;
public class MiddleOfTheLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        for(int i=0;i<(count+1)/2;i++){
            head=head.next;
        }
        return head;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").replaceAll("]","").split(",");
        ListNode head = new ListNode(Integer.valueOf(str[0]));
        ListNode temp = head;
        for(int i=1;i<str.length;i++){
            temp.next=new ListNode(Integer.valueOf(str[i]));
            temp=temp.next;
        }
        temp = middleNode(head);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }


}
