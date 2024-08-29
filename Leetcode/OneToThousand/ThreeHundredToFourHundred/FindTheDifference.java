package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        int[] charArray = new int[26];
        for(char c : t.toCharArray())
            charArray[c-'a']++;
        for(char c : s.toCharArray())
            charArray[c-'a']--;
        for(int i = 0; i < 26; i++)
            if(charArray[i] > 0)
                return (char) ('a' + i);
        return 'a';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(findTheDifference(s,t));
    }
}
