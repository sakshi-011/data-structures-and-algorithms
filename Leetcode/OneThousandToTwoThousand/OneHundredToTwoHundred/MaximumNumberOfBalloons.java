package Leetcode.OneThousandToTwoThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        int max = 0;
        for(char c : text.toCharArray()){
            count[c - 'a']++;
        }
        count[11] /= 2;
        count[14] /= 2;
        max = Math.min(count[0],Math.min(count[1],Math.min(count[11],Math.min(count[13],count[14]))));
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(maxNumberOfBalloons(s));
    }
}
