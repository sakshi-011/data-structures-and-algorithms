package Leetcode.OneThousandToTwoThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    public static int minimumLength(String s) {
        int l = s.length(), low = 0, high = l-1;
        while(low < high && s.charAt(low) == s.charAt(high)){
            char c = s.charAt(low);

            while (low <= high && s.charAt(low) == c) {
                low++;
            }

            while (high > low && s.charAt(high) == c) {
                high--;
            }
        }

        return high - low + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(minimumLength(s));
    }
}
