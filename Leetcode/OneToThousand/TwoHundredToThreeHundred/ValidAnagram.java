package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(isAnagram(s,t));
    }

}
