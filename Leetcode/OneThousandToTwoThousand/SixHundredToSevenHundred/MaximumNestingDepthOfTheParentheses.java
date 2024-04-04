package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class MaximumNestingDepthOfTheParentheses {

    public static int maxDepth(String s) {
        if(s.isEmpty())
            return 0;
        int count = 0, max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                count++;
            max = Math.max(count, max);
            if(s.charAt(i) == ')')
                count--;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(maxDepth(s));
    }
}
