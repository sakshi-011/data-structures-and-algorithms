package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;
public class MaximumLengthSubstringWithTwoOccurrences {

    public static int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0, res = 0;

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            count[ch]++;

            while (count[ch] > 2) {
                int ch2 = s.charAt(left) - 'a';
                count[ch2]--;
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(maximumLengthSubstring(s));
    }
}
