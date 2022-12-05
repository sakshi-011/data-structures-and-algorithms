package Leetcode.OneThousandToTwoThousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class DetermineIfStringHalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        int a=0,b=0, n=s.length();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(int i=0;i<n/2;i++){
            if(vowels.contains(s.charAt(i)))
                a++;
            if(vowels.contains(s.charAt(n-i-1)))
                b++;
        }
        if(a==b) return true;
        return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(halvesAreAlike(s));
    }

}
