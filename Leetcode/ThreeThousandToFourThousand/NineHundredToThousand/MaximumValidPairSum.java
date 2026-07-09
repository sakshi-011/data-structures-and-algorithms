package Leetcode.ThreeThousandToFourThousand.NineHundredToThousand;

import java.util.Scanner;

public class MaximumValidPairSum {

    public static int maxValidPairSum(int[] nums, int k) {
        int currMax = Integer.MIN_VALUE, n = nums.length, sum = 0;

        for(int i = k; i < n; i++){
            currMax = Math.max(currMax, nums[i-k]);
            sum = Math.max(currMax + nums[i], sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int k = in.nextInt();
        System.out.println(maxValidPairSum(nums,k));
    }
}
