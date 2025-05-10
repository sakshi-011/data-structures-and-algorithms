package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.Scanner;

public class MinimumEqualSumOfTwoArraysAfterReplacingZeros {

    public static long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0, count1 = 0, count2 = 0;
        for(int x : nums1){
            if(x == 0) {
                count1++;
                sum1++;
            }
            sum1 += x;
        }
        for(int x : nums2){
            if(x == 0) {
                count2++;
                sum2++;
            }
            sum2 += x;
        }

        if((count1 == 0 && sum2 > sum1) || (count2 == 0 && sum1 > sum2))
            return -1;

        return Math.max(sum1, sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums1 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums1[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums2 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums2[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minSum(nums1, nums2));
    }
}
