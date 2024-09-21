package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class MaximumDifferenceByRemappingADigit {

    public static int minMaxDifference(int num) {
        int min = 0, max = 0, i = 0;
        String s = Integer.toString(num);
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '9')
                break;
        }
        String t = i == s.length() ? s : s.replaceAll(s.charAt(i)+"","9");
        max = Integer.parseInt(t);
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0')
                break;
        }
        t = i == s.length() ? s : s.replaceAll(s.charAt(i)+"","0");
        min = Integer.parseInt(t);
        return max-min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(minMaxDifference(num));
    }

}
