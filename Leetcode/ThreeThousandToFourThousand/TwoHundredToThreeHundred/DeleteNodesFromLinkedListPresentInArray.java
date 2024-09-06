package Leetcode.ThreeThousandToFourThousand.TwoHundredToThreeHundred;

import java.util.Set;
import java.util.HashSet;
import Leetcode.ListNode;

public class DeleteNodesFromLinkedListPresentInArray {

    public static ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> valuesToRemove = new HashSet<>();
        for (int num : nums) {
            valuesToRemove.add(num);
        }

        while (head != null && valuesToRemove.contains(head.val)) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current.next != null) {
            if (valuesToRemove.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        head.next.next.next = new ListNode(4, new ListNode(5));
        ListNode node = modifiedList(nums, head);
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
}
