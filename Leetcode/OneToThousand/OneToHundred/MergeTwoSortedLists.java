package Leetcode.OneToThousand.OneToHundred;

import Leetcode.OneToThousand.ThreeHundredToFourHundred.OddEvenLinkedList;

import java.util.Scanner;

/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next= new ListNode(list1.val);
                list1 = list1.next;
            }else{
                temp.next= new ListNode(list2.val);
                list2 = list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        String[] str1 = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        String[] str2 = t.replaceAll("\\[", "").replaceAll("]", "").split(",");
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode temp = list1;
        for (int i = 0; i < str1.length; i++) {
            if(list1==null)
                list1 = new ListNode(Integer.parseInt(str1[i]));
            else {
                temp.next = new ListNode(Integer.parseInt(str1[i]));
                temp=temp.next;
            }
        }
        temp = list2;
        for (int i = 0; i < str2.length; i++) {
            if(list2==null)
                list2 = new ListNode(Integer.parseInt(str2[i]));
            else {
                temp.next = new ListNode(Integer.parseInt(str2[i]));
                temp=temp.next;
            }
        }
        ListNode res = mergeTwoLists(list1,list2);
        while(res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }

}
