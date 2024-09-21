package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class LeftAndRightSumDifferences {

    public static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        for(int i = 1; i<n; i++){
            left[i] = left[i-1]+nums[i-1];
        }
        for(int i = n-2; i>=0; i--){
            right[i] = right[i+1]+nums[i+1];
        }
        for(int i = 0; i<n; i++){
            ans[i] = Math.abs(left[i]-right[i]);
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
        int[] ans = leftRigthDifference(nums);
        for(int a : ans)
            System.out.print(a+", ");
    }

}
