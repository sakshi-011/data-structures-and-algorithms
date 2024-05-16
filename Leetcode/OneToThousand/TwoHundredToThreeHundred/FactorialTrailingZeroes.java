package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0, i = 5;
        while(n / i > 0){
            count += n / i;
            i *= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(trailingZeroes(n));
    }
}
