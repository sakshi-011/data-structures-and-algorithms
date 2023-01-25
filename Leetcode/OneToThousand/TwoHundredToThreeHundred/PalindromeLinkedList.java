package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import Leetcode.ListNode;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while(head != null){
            l.add(head.val);
            head = head.next;
        }
        int n = l.size();
        for (int i = 0; i < n/2; i++) {
            if(l.get(i) != l.get(n-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(2,new ListNode(1));

        System.out.println(isPalindrome(l));
    }

}
