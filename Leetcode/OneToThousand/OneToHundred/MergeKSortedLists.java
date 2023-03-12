package Leetcode.OneToThousand.OneToHundred;

import Leetcode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val < o2.val)
                    return -1;
                else if(o1.val == o2.val)
                    return 0;
                else
                    return 1;
            }
        });
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        for(ListNode l : lists){
            if(l != null)
                q.offer(l);
        }
        while(!q.isEmpty()){
                tail.next = q.poll();
                tail = tail.next;
                if(tail.next != null)
                    q.offer(tail.next);
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;
        ListNode ans = mergeKLists(lists);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }

}
