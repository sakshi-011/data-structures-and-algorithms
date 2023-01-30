package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static int expandFromCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, end = 0;
        if(n < 1 || s == null )
            return "";
        for (int i = 0; i < n; i++) {
            int l1 = expandFromCenter(s,i,i);
            int l2 = expandFromCenter(s,i,i+1);
            int len = Math.max(l1,l2);
            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(longestPalindrome(s));
    }

}
