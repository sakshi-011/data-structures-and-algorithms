package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.HashSet;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                ans+=2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        ans = ans==s.length() ? ans : ans+1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        System.out.println(longestPalindrome(s));
    }

}
