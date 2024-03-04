package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;

public class MinimumOperationsToExceedThresholdValue1 {

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i : nums){
            if(i < k)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++)
            nums[i] = Integer.valueOf(st[i]);
        int k = in.nextInt();
        System.out.println(minOperations(nums,k));
    }
}
