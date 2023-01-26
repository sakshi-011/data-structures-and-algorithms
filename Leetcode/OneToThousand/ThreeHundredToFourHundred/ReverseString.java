package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] s) {
        int n = s.length;
        char c;
        for (int i = 0; i < n/2; i++) {
            c = s[n-1-i];
            s[n-1-i] = s[i];
            s[i] = c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        reverseString(s.toCharArray());
    }

}
