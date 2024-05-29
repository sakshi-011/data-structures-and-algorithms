package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {

    public static int numSteps(String s) {
        int N = s.length();

        int operations = 0;
        int carry = 0;
        for (int i = N - 1; i > 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i)) + carry;

            if (digit % 2 == 1) {
                operations += 2;
                carry = 1;
            } else {
                operations++;
            }
        }

        return operations + carry;
    }

    /* O(N^2)
    /*
    public static int numSteps(String s) {
        s = s.replaceFirst("^0+(?!$)", "");
        if(s.equals("1"))
            return 0;
        int ans = 0, len = s.length();
        while(len > 1) {
            if (s.charAt(len - 1) == '0') {
                s = s.substring(0, len - 1);
                len--;
            } else {
                s = addOne(s);
                len = s.length();
            }
            ans++;
        }
        return ans;
    }

    public static String addOne(String t)
    {
        char[] x = t.toCharArray();
        boolean found = false;
        for(int i = x.length-1; i >= 0; i--){
            if(x[i] == '0') {
                found = true;
                x[i] = '1';
                break;
            } else if(x[i] != '0') {
                x[i] = '0';
            }
        }
        String st = String.valueOf(x);
        return found ? st : "1"+st;
    }
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(numSteps(s));
    }
}
