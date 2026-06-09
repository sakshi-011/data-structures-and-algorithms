package Leetcode.ThreeThousandToFourThousand.SixHundredToSevenHundred;

public class MaximumTotalSubarrayValue1 {

    public static long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int x : nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        return k * (max - min);
    }

    public static void main(String[] args) {
        System.out.println(maxTotalValue(new int[]{4,2,5,1},3));
        System.out.println(maxTotalValue(new int[]{1,3,2},2));
    }
}
