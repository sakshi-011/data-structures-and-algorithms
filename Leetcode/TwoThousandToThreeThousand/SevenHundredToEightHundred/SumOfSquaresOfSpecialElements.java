package Leetcode.TwoThousandToThreeThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class SumOfSquaresOfSpecialElements {

    public static int sumOfSquares(int[] nums) {
        int n = nums.length, sum = 0;
        for(int i = 0; i < n; i++){
            if(n % (i+1) == 0)
                sum = sum + nums[i]*nums[i];
        }
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
        System.out.println(sumOfSquares(nums));
    }
}
