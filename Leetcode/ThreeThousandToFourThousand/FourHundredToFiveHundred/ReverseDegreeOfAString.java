package Leetcode.ThreeThousandToFourThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class ReverseDegreeOfAString {

    public static int reverseDegree(String s) {
        int sum = 0, pos = 1;
        for(char c : s.toCharArray()){
            sum += (26 - (c - 'a')) * pos;
            pos++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(reverseDegree(s));
    }
}
