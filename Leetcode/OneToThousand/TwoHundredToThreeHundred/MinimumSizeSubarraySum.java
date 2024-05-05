package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minSubArrayLen(target,nums));
    }
}
