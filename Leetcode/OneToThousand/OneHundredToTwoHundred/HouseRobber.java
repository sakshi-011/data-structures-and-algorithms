package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
public class HouseRobber {

    public static int rob(int[] nums) {
        int rob = 0, notRob = 0, curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr = notRob + nums[i];
            notRob = Math.max(notRob, rob);
            rob = curr;
        }
        return Math.max(rob,notRob);
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
