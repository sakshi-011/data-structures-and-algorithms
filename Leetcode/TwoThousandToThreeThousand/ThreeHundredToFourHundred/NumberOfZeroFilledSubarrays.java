package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class NumberOfZeroFilledSubarrays {

    public static long zeroFilledSubarray(int[] nums) {
        long cnt = 0, end = 0;
        for (int n : nums) {
            if (n == 0) {
                cnt += ++end;
            } else {
                end = 0;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(zeroFilledSubarray(nums));
    }
}
