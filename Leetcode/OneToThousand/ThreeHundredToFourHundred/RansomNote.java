package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i = 0; i < magazine.length(); i++)
            count[magazine.charAt(i) - 'a']++;
        for(int i = 0; i < ransomNote.length(); i++)
            count[ransomNote.charAt(i) - 'a']--;
        for(int i = 0; i < 26; i++)
            if(count[i] < 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(canConstruct(s,t));
    }
}
