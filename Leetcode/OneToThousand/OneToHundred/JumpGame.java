package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        boolean[] res = new boolean[nums.length];
        res[nums.length-1] = true;
        for (int i = nums.length-2; i >= 0; i--) {
            for (int j = nums[i]; j > 0; j--) {
                if(i+j>=nums.length || res[i+j]){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(canJump(nums));
    }

}
