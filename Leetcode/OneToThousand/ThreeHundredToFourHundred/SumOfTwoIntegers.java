package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {
        while (b != 0)
        {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(getSum(a,b));
    }
}
