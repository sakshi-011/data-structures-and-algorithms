package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;
import java.util.Set;
import java.util.HashSet;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            set.add(head);
            if(set.contains(head.next))
                return true;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        l.next = new ListNode(2);
        l.next.next = new ListNode(0);
        l.next.next.next = new ListNode(-4);
        l.next.next.next.next = l.next;

        System.out.println(hasCycle(l));
    }

}
