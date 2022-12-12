package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] fib = new int[100];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(climbStairs(n));
    }

}
