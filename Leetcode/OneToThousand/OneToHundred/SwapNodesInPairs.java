package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import Leetcode.ListNode;

public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode temp = ans, first = head, second = head;
        while (temp.next != null && temp.next.next != null) {
            first = temp.next;
            second = temp.next.next;
            first.next = second.next;
            temp.next = second;
            temp.next.next = first;
            temp = temp.next.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        ListNode head = new ListNode();
        ListNode temp = head;
        if(st.length >= 1 && s.length() > 2) {
            head.val = Integer.valueOf(st[0]);
            for (int i = 1; i < st.length; i++) {
                temp.next = new ListNode(Integer.valueOf(st[i]));
                temp = temp.next;
            }
        }
        ListNode ans = swapPairs(head);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
}
