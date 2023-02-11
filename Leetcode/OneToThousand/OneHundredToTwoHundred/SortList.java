package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;
import java.util.Scanner;

public class SortList {

    public static ListNode getMid(ListNode head){
        ListNode slow = null, fast = head, midPrev = null;
        while(fast != null && fast.next != null){
            slow = slow == null ? head : slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }else{
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        tail.next = l1 != null ? l1 : l2;
        return ans.next;
    }

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        temp = sortList(head);
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
}
