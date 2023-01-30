package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class DivideTwoIntegers {

    public static int divide(int A, int B) {
        if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
        int a = Math.abs(A), b = Math.abs(B), res = 0;
        for (int x = 31; x >= 0; x--)
            if ((a >>> x) - b >= 0) {
                res += 1 << x;
                a -= b << x;
            }
        return (A > 0) == (B > 0) ? res : -res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divident = in.nextInt();
        int divisor = in.nextInt();
        System.out.println(divide(divident,divisor));
    }

}
