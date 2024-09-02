package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1]+nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int[] ans = runningSum(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }

}
