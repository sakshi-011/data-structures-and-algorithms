package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if((Math.log10(n) / Math.log10(3)) % 1 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPowerOfThree(n));
    }

}
