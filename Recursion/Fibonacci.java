package Recursion;

import java.util.Scanner;

public class Fibonacci {

    //Calculate nth fibonacci number
    public static int fibonacciNumber(int n){
        if(n<0) return -1;
        if(n==0 || n==1) return n;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacciNumber(n-1));
    }
}
