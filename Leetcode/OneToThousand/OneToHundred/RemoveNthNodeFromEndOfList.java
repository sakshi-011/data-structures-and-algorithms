package Leetcode.OneToThousand.OneToHundred;

import Leetcode.ListNode;
import java.util.Scanner;

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        while(n != 0){
            fast = fast.next;
            n--;
        }
        if (fast == null)
            return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);

        ListNode ans = removeNthFromEnd(l,n);
        while(ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

}
