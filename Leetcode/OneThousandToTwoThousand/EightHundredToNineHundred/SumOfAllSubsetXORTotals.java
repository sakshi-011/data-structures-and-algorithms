package Leetcode.OneThousandToTwoThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class SumOfAllSubsetXORTotals {

    public static int subsetXORSum(int[] nums) {
        return XORSum(nums, 0, 0);
    }

    private static int XORSum(int[] nums, int index, int currentXOR) {
        if (index == nums.length)
            return currentXOR;

        int withElement = XORSum(nums, index + 1, currentXOR ^ nums[index]);
        int withoutElement = XORSum(nums, index + 1, currentXOR);

        return withElement + withoutElement;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(subsetXORSum(nums));
    }
}
