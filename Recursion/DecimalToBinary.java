package Recursion;

import java.util.Scanner;

public class DecimalToBinary {

    //Convert decimal number to binary
    public static int decimalToBinary(int n){
        if(n<0) return -1;
        if(n == 0) return 0;
        return n%2 + 10 * decimalToBinary(n/2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Binary value of "+n+" = "+ decimalToBinary(n));
    }
}
