package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class MaximumAverageSubarray1 {

    public static double findMaxAverage(int[] nums, int k) {
        double avg, sum = 0, n = nums.length, max = -Double.MAX_VALUE;
        int prev;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        avg = sum / k;
        max = Math.max(max, avg);
        for(int i = k; i < n; i++){
            prev = nums[i-k];
            sum += nums[i] - prev;
            avg = sum / k;
            max = Math.max(max, avg);
        }
        return max;
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
        System.out.println(findMaxAverage(nums,k));
    }
}
