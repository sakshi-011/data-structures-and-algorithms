package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;

public class CountOddNumbersInAnIntervalRange {

    public static int countOdds(int low, int high) {
        int nums = high-low+1;
        if(nums % 2 == 1 && low % 2 == 1)
            return nums/2 + 1;
        return nums/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        System.out.println(countOdds(low,high));
    }

}
