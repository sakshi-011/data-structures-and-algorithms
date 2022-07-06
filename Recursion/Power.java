package Recursion;

import java.util.Scanner;

public class Power {

    //x raised to the power n; where n is positive integer
    public static int power(int x, int n){
        if(n<0) return -1;
        if (n==0) return 1;
        return x * power(x,n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(x+" raised to the power "+n+" = "+power(x,n));
    }
}
