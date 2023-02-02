package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;

public class StrictlyPalindromicNumber {

    public static boolean isPalindrome(String s){
        int l = s.length();
        if(l == 1)
            return true;
        for (int i = 0; i < l/2; i++) {
            if(s.charAt(i) != s.charAt(l-i-1))
                return false;
        }
        return true;
    }

    public static boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        for (int i = 2; i < n-1; i++) {
            if(!isPalindrome(Integer.toString(n,i)))
                return false;
        }
        return true;
    }

    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isStrictlyPalindromic(n));
    }

}
