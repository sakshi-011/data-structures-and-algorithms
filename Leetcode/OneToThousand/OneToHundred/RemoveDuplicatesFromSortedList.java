package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import Leetcode.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next, curr = head;
        int val = head.val;
        while(temp!=null){
            if(val == temp.val){
                curr.next = temp.next;
            }else{
                val = temp.val;
                curr = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        ListNode head = new ListNode(Integer.valueOf(str[0]));
        ListNode temp = head;
        for (int i = 1; i < str.length; i++) {
            temp.next = new ListNode(Integer.valueOf(str[i]));
            temp = temp.next;
        }
        temp = deleteDuplicates(head);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
