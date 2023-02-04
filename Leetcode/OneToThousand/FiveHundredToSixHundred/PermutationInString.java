package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class PermutationInString {

    public static boolean matches(int[] arr1, int[] arr2){
        for (int i = 0; i < 26; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if(l2 < l1)
            return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        for (int i = 0; i < l1; i++) {
            countS1[s1.charAt(i)-'a']++;
            countS2[s2.charAt(i)-'a']++;
        }
        for (int i = 0; i < l2 - l1; i++) {
            if(matches(countS1,countS2))
                return true;
            countS2[s2.charAt(i+l1)-'a']++;
            countS2[s2.charAt(i)-'a']--;
        }
        return matches(countS1,countS2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(checkInclusion(s1,s2));
    }

}
