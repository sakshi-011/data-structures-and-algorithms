package Recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {

    //Find the greatest common divisor of two positive integers using Euclidean algorithm
    public int gcd(int a, int b){
        if(a<0 || b<0) return -1;
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        int x = a>b ? gcd.gcd(a,b) : gcd.gcd(b,a);
        System.out.println("GCD of "+a+" and "+b+" = "+x);
    }
}
