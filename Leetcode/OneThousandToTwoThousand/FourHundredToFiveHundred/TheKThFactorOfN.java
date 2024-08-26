package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class TheKThFactorOfN {

    public static int kthFactor(int n, int k) {
        if(k == 1)
            return 1;
        int count = 1;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0)
                count++;
            if(count == k)
                return i;
        }
        if(++count == k)
            return n;
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(kthFactor(n,k));
    }
}
