package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class LongestSubarrayWithMaximumBitwiseAND {

    public static int longestSubarray(int[] nums) {
        int maxVal = 0, ans = 0, currentStreak = 0;

        for (int num : nums) {
            if (maxVal < num) {
                maxVal = num;
                ans = currentStreak = 0;
            }
            if (maxVal == num) {
                currentStreak++;
            } else {
                currentStreak = 0;
            }
            ans = Math.max(ans, currentStreak);
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
        System.out.println(longestSubarray(nums));
    }
}
