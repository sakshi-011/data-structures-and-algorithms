package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMovesToEqualArrayElements2 {

    public static int minMoves2(int[] nums) {
        int n = nums.length, median = 0, sum = 0;
        Arrays.sort(nums);
        if(n % 2 == 0){
            median = (nums[(n-1)/2] + nums[n/2]) / 2;
        } else {
            median = nums[n/2];
        }
        System.out.println(median);
        for (int i = 0; i < n; i++) {
            sum += Math.abs(median - nums[i]);
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
        System.out.println(minMoves2(nums));
    }
}
