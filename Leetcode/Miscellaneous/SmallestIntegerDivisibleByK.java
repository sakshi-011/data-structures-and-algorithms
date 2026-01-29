package Leetcode.Miscellaneous;

import java.util.Scanner;

public class SmallestIntegerDivisibleByK {

    public static int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;

        int n = 0;
        for(int len = 1; len <= k; len++){
            n = (n * 10 + 1) % k;
            if(n == 0)
                return len;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(smallestRepunitDivByK(num));
    }
}
