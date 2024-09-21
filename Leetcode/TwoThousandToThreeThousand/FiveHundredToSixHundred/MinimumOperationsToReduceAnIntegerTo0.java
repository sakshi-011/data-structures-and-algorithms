package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
public class MinimumOperationsToReduceAnIntegerTo0 {

    public static int minOperations(int n) {
        int ans = 0;
        while(n != 0) {
            if(n % 2 == 1) {
                if(n==1 || (n & 2) == 0) {
                    n -= 1;
                } else {
                    n += 1;
                }
                ans++;
            } else {
                n /= 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(minOperations(n));
    }

}
