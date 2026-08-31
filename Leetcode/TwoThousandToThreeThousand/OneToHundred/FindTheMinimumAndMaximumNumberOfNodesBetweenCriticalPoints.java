package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import Leetcode.ListNode;

public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode ptr = head.next;
        int prev = head.val, min = Integer.MAX_VALUE, max = 0, count0 = 0, count1 = 0;
        String s = "0";
        while(ptr.next != null){
            if(ptr.val < prev && ptr.val < ptr.next.val)
                s = s+"1";
            else if(ptr.val > prev && ptr.val > ptr.next.val)
                s = s+"1";
            else
                s = s+"0";
            prev = ptr.val;
            ptr = ptr.next;
        }

        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0'){
                if(count1 >= 1)
                    count0++;
            } else {
                if(count1 >= 1)
                    min = Math.min(min,count0);
                max += count0;
                count0 = 1;
                count1++;
            }
        }

        if(count1 < 2)
            return new int[]{-1,-1};

        return new int[]{min,max};
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(2,
                new ListNode(5, new ListNode(1, new ListNode(2)))))));
        int[] ans = nodesBetweenCriticalPoints(node);
        System.out.println("["+ans[0]+","+ans[1]+"]");
    }
}
