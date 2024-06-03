package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class AppendCharactersToStringToMakeSubsequence {

    public static int appendCharacters(String s, String t) {
        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE, ptr = 0;
        int s1 = s.length(), s2 = t.length();
        for(int i = 0; i < s1; i++){
            if(s.charAt(i) == t.charAt(ptr))
                ptr++;
            if(ptr == s2)
                return 0;
        }
        left = s2 - ptr;
        ptr = s2-1;
        for(int i = s1-1; i >= 0; i--){
            if(s.charAt(i) == t.charAt(ptr))
                ptr--;
            if(ptr < 0)
                return 0;
        }
        right = 2*s2 - ptr - 1;
        return Math.min(left,right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(appendCharacters(s,t));
    }
}
