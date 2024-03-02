package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class MaximumOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int count0 = 0, count1 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                count1 ++;
        }
        count0 = s.length() - count1;
        String ans = "";
        if(count1 > 1){
            for(int i = 0; i < count1-1; i++){
                ans += "1";
            }
        }
        for(int i = 0; i < count0; i++){
            ans += "0";
        }
        ans += "1";
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(maximumOddBinaryNumber(s));
    }
}
