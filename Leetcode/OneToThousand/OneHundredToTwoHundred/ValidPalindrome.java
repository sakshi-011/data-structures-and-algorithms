package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        String t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int start = 0, end = t.length()-1;
        while(start<end)
            if(t.charAt(start++)!=t.charAt(end--))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isPalindrome(s));
    }

}
