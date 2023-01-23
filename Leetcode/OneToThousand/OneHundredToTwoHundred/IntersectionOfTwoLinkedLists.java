package Leetcode.OneToThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode temp1 = headA, temp2 = headB;
        while(temp2 != null){
            temp1 = headA;
            while(temp1 != null){
                if(temp1 == temp2)
                    return temp2;
                temp1 = temp1.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(1);
        l2.next.next = l1.next;

        ListNode ans = getIntersectionNode(l1,l2);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

}
