package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;

public class MinimumAddToMakeParenthesesValid {

    public static int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddsRequired = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else {
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    minAddsRequired++;
                }
            }
        }
        return minAddsRequired + openBrackets;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(minAddToMakeValid(s));
    }
}
