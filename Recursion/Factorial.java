package Recursion;

import java.util.Scanner;

public class Factorial {

    //Calculate factorial of a number
    public static int factorial(int n){
        if(n<0) return -1;
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial of "+n+" = "+ factorial(n));
    }

}
