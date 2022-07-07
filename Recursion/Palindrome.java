package Recursion;

import java.util.Scanner;

public class Palindrome {

    //Check if a string is a palindrome
    public static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length() == 1) return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));
    }

}
