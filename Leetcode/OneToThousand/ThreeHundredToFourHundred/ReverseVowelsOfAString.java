package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] ans = s.toCharArray();
        int n = s.length(), left = 0, right = n-1;
        while(left < right){
            char l = s.charAt(left), r = s.charAt(right);
            if(!vowels.contains(l)){
                left++;
            }
            if(!vowels.contains(r)){
                right--;
            }
            if(vowels.contains(l) && vowels.contains(r)){
                ans[left++] = ans[right];
                ans[right--] = l;
            }
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(reverseVowels(s));
    }
}
