package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class DivisibleAndNonDivisibleSumsDifference {

    public static int differenceOfSums(int n, int m) {
        long sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0)
                sum += i;
            else
                sum -= i;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(differenceOfSums(n, m));
    }
}
