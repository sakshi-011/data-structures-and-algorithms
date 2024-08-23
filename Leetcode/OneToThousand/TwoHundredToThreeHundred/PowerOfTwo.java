package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        while(n > 1){
            if(n % 2 == 1)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
