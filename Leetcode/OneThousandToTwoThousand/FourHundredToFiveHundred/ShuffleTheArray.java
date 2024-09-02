package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        if(n == 0)
            return nums;
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0, idx = 0; i < len/2; i++) {
            ans[idx++] = nums[i];
            ans[idx++] = nums[i+n];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int n = in.nextInt();

        int[] ans = shuffle(nums,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }

}
