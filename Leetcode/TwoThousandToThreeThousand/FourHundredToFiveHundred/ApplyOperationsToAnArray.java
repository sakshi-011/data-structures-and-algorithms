package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class ApplyOperationsToAnArray {

    public static int[] applyOperations(int[] nums) {
        int n = nums.length, ptr = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int[] ans = new int[n];
        for(int i : nums)
            if(i != 0)
                ans[ptr++] = i;
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
        int[] ans = applyOperations(nums);
        for(int i : ans)
            System.out.print(i+" ");
    }
}
