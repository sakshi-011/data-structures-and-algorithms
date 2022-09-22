package Leetcode.OneToHundred;

import java.util.Scanner;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=(l1.val+l2.val)%10,carry = (l1.val+l2.val)/10;
        ListNode a = new ListNode(sum);
        ListNode l = a;
        while(l1.next!=null || l2.next!=null){
            if(l1.next == null && l2.next != null){
                l2 = l2.next;
                sum = (l2.val+carry)%10;
                carry = (l2.val+carry)/10;
            }
            else if(l1.next != null && l2.next == null){
                l1 = l1.next;
                sum = (l1.val+carry)%10;
                carry = (l1.val+carry)/10;
            }
            else if(l1.next != null && l2.next != null){
                l1=l1.next;
                l2=l2.next;
                sum = (l1.val+l2.val+carry)%10;
                carry = (l1.val+l2.val+carry)/10;
            }
            l.next = new ListNode(sum);
            l=l.next;
        }
        if(carry !=0 ){
            l.next = new ListNode(carry);
        }
        return a;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x,i;
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode temp = null;
        int n = in.nextInt();
        for(i=0;i<n;i++){
            x = in.nextInt();
            if(l1==null){
                l1 = new ListNode(x);
                temp=l1;
            }
            else{
                temp.next = new ListNode(x);
                temp = temp.next;
            }
        }
        n = in.nextInt();
        for(i=0;i<n;i++){
            x = in.nextInt();
            if(l2==null){
                l2 = new ListNode(x);
                temp=l2;
            }
            else{
                temp.next = new ListNode(x);
                temp = temp.next;
            }
        }
        ListNode ans = addTwoNumbers(l1,l2);
        while(ans.next!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
        System.out.print(ans.val);
    }

}
