package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;
public class FibonacciNumber {

    public static int fib(int n) {
        int[] fib = new int[100];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }
}
