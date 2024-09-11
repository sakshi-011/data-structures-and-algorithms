package Leetcode.TwoThousandToThreeThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class MinimumBitFlipsToConvertNumber {

    public static int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        int count = 0;
        while (xorResult != 0) {
            count += xorResult & 1;
            xorResult >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int goal = in.nextInt();
        System.out.println(minBitFlips(start,goal));
    }
}
