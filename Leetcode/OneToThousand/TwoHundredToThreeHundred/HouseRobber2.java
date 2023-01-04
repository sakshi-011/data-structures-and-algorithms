package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class HouseRobber2 {

    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        return Math.max(rob2(nums,0,len-1),rob2(nums,1,len));
    }

    public static int rob2(int[] nums, int l, int r) {
        int rob = 0, notRob = 0, curr = 0;
        for (int i = l; i < r; i++) {
            curr = notRob + nums[i];
            notRob = Math.max(notRob, rob);
            rob = curr;
        }
        return Math.max(rob, notRob);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(rob(nums));
    }

}
