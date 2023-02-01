package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {

    public static int gcd(int x, int y){
        if(y == 0)
            return x;
        else{
            return gcd(y,x % y);
        }
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1))
            return "";
        String ans, temp = str1;
        if(str2.length() > str1.length()){
            str1 = str2;
            str2 = temp;
        }
        ans = str1.substring(0,gcd(str1.length(),str2.length()));
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(gcdOfStrings(s1,s2));
    }

}
