package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        left[0]=nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = nums[i]+left[i-1];
        }
        int total = left[n-1];
        if(total-left[0]==0) return 0;
        for (int i = 1; i < n; i++) {
            if(left[i-1]==total-left[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(pivotIndex(nums));
    }

}
