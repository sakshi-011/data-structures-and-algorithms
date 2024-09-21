package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Arrays;

public class CountTheNumberOfFairPairs {

    public static long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        int n = nums.length, l = n-1, r = n-1;
        if(n == 1)
            return 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            while(0 <= r && nums[i] + nums[r] > upper)
                --r;
            while(0 <= l && nums[i] + nums[l] >= lower)
                --l;
            ans += r-l;
            if (i > l && i <= r)
                --ans;
        }
        return ans/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int lower = in.nextInt();
        int upper = in.nextInt();
        System.out.println(countFairPairs(nums,lower,upper));
    }

}
