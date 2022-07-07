package Recursion;

import java.util.Scanner;

public class ReverseString {

    //Reverse a string
    public static String reverse(String str){
        if(str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Reverse of "+str+" = "+ reverse(str));
    }

}
