package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;

public class CountTotalNumberOfColoredCells {

    public static long coloredCells(int n) {
        long ans = 0;
        if(n == 1)
            return 1;
        long num1 = (long) n * n;
        long num2 = (long) (n-1)*(n-1);
        ans = num1 + num2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(coloredCells(n));
    }
}
