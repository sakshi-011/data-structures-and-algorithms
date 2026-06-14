package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import Leetcode.ListNode;
import java.util.Map;
import java.util.HashMap;

public class MaximumTwinSumOfALinkedList {

    public static int pairSum(ListNode head) {
        int length = 0;
        ListNode temp = head;
        Map<Integer,Integer> map = new HashMap<>();
        while(temp != null){
            map.put(length,temp.val);
            length++;
            temp = temp.next;
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < length/2; i++){
            sum = map.get(i) + map.get(length-1-i);
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(5,new ListNode(4,new ListNode(2,new ListNode(1))));
        System.out.println(pairSum(list));
        list = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        System.out.println(pairSum(list));
    }

}
