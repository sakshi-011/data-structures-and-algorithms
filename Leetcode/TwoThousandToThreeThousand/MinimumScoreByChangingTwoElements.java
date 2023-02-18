package Leetcode.TwoThousandToThreeThousand;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumScoreByChangingTwoElements {

    public static int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 3)
            return 0;
        int min = Math.min(nums[n-1]-nums[2],Math.min(nums[n-1]-nums[0],Math.min(nums[n-3]-nums[0],nums[n-2]-nums[1])));
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minimizeSum(nums));
    }
}
