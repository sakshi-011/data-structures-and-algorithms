package Leetcode.ThreeThousandToFourThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class MinimumMovesToEqualArrayElements3 {

    public static int minMoves(int[] nums) {
        int max = nums[0], sum = 0;
        for(int x : nums){
            max = Math.max(max, x);
        }
        for(int x : nums)
            sum += max - x;
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
        System.out.println(minMoves(nums));
    }
}
