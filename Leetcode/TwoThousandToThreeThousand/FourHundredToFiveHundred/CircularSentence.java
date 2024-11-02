package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class CircularSentence {

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        String last = words[words.length - 1], left = words[0];
        if(left.charAt(0) != last.charAt(last.length() - 1))
            return false;
        for(int i = 1; i < words.length; i++){
            if(words[i].charAt(0) != left.charAt(left.length() - 1)) {
                return false;
            }
            left = words[i];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isCircularSentence(s));
    }
}
