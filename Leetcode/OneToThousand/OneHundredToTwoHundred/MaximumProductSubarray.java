package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i],max * nums[i]);
            min = Math.min(nums[i],min * nums[i]);
            res = Math.max(max,res);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(maxProduct(nums));
    }

}
