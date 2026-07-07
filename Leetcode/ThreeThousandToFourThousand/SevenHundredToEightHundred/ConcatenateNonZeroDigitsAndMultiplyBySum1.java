package Leetcode.ThreeThousandToFourThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class ConcatenateNonZeroDigitsAndMultiplyBySum1 {

    public static long sumAndMultiply(int n) {
        long ans = 0l, sum = 0l;
        int rev = 0, d;

        while(n > 0){
            d = n % 10;
            n = n / 10;
            sum += d;
            if(d != 0)
                rev = rev * 10 + d;
        }
        while(rev > 0){
            d = rev % 10;
            rev = rev / 10;
            ans = ans*10 +d ;
        }
        return ans * sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumAndMultiply(n));
    }
}
