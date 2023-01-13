package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class JumpGame2 {

    public static int jump(int[] nums) {
        int start = 0, end = 0, jumps = 0;
        for (int i = 0; i < nums.length-1; i++) {
            start = Math.max(start,i+nums[i]);
            if(i == end){
                jumps++;
                end = start;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(jump(nums));
    }
}
