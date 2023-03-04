package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;

public class CountSubarraysWithFixedBounds {

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0, jbad = -1, jmin = -1, jmax = -1, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < minK || nums[i] > maxK)
                jbad = i;
            if (nums[i] == minK)
                jmin = i;
            if (nums[i] == maxK)
                jmax = i;
            res += Math.max(0L, Math.min(jmin, jmax) - jbad);
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
        int minK = in.nextInt();
        int maxK = in.nextInt();
        System.out.println(countSubarrays(nums,minK,maxK));
    }

}
