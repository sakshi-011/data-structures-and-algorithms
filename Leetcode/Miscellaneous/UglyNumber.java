package Leetcode.Miscellaneous;

import java.util.Scanner;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if(n == 0)
            return false;
        if(n >=1 && n <= 6)
            return true;
        while(n % 2 == 0){
            n = n / 2;
        }
        while(n % 3 == 0){
            n = n / 3;
        }
        while(n % 5 == 0){
            n = n / 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isUgly(n));
    }
}
