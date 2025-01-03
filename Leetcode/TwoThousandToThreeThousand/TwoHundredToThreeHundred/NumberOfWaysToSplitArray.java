package Leetcode.TwoThousandToThreeThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class NumberOfWaysToSplitArray {

    public static int waysToSplitArray(int[] nums) {
        int ans = 0, n = nums.length;
        long sum = 0L;
        long[] prefixSum = new long[n];
        long[] suffixSum = new long[n];
        for(int i = 0; i < n; i++){
            sum += nums[i];
            prefixSum[i] = sum;
        }
        sum = 0L;
        for(int i = n-1; i > 0; i--){
            sum += nums[i];
            suffixSum[i] = sum;
        }
        for(int i = 0; i < n-1; i++){
            if(prefixSum[i] >= suffixSum[i+1])
                ans++;
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
        System.out.println(waysToSplitArray(nums));
    }
}
