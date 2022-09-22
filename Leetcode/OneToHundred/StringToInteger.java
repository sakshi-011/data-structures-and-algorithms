package Leetcode.OneToHundred;

import java.util.Scanner;

public class StringToInteger {
    public static int myAtoi(String s){
        int x=-1,sign=1,i, c=0;
        s=s.trim();
        long n=0;
        if(s.length() == 0){
            return 0;
        }
        if(s.charAt(0) == '-') {
            sign=-1;
        }

        for(i = 0; i<s.length(); i++){
            if(i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')){
                continue;
            }
            if(c > 10){
                break;
            }

            if(s.charAt(i) - 48 >=0 && s.charAt(i) - 48 <=9){
                n = n*10 + (s.charAt(i) - 48);
                if(n == 0 && (s.charAt(i) - 48) == 0){
                    continue;
                }
                else{
                    c++;
                }
            }
            else break;

        }

        if (n > Integer.MAX_VALUE) {
            n = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        n*=sign;
        return (int)n;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int x = myAtoi(s);
        System.out.println(x);
    }
}
