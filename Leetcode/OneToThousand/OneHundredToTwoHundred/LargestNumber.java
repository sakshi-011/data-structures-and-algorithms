package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
        String ans = "";
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> {
                    String s = ""+a+b, t = ""+b+a;
                    return t.compareTo(s);
                }
        );
        for(int n : nums)
            pq.add(n);
        if(pq.peek().equals(0))
            return "0";
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(largestNumber(nums));
    }
}
