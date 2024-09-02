package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class MaximumLengthOfSubarrayWithPositiveProduct {

    public static int getMaxLen(int[] nums) {
        int count = 0, max = 0, negCount = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count = 0;
                negCount = 0;
            }else if(nums[i] > 0){
                count++;
                negCount = negCount == 0 ? 0 : negCount+1;
            }else{
                temp = count;
                count = negCount == 0 ? 0 : negCount + 1;
                negCount = temp + 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(getMaxLen(nums));
    }

}
