package Leetcode.TwoThousandToThreeThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class PercentageOfLetterInString {

//    public static int percentageLetter(String s, char letter) {
//        return (int)(s.chars().filter(c -> c == letter).count()*100/s.length());
//    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter)
                count++;
        }
        return (int)(count*100/s.length());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char letter = in.next().charAt(0);
        System.out.println(percentageLetter(s,letter));
    }

}
