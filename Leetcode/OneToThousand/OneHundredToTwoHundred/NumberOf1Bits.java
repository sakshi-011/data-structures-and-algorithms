package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class NumberOf1Bits {

    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count = count + (n & 1);
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(hammingWeight(n));
    }
}
