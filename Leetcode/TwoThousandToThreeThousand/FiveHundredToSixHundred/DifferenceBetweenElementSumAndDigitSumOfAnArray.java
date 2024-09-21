package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

    public static int differenceOfSum(int[] nums) {
        int digSum = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(nums[i]<10){
                digSum += nums[i];
            }else{
                while(nums[i]>0){
                    digSum += nums[i] % 10;
                    nums[i] /= 10;
                }
            }
        }
        return Math.abs(sum-digSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(differenceOfSum(nums));
    }

}
