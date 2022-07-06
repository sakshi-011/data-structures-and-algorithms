package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    //Find the sum of digits of a positive number
    public static int sumOfDigits(int n){
        if(n<0) return -1;
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Sum of digits of "+n+" = "+sumOfDigits(n));
    }
}
