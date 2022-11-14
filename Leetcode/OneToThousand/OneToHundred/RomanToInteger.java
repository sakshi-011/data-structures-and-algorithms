package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {

    public static boolean subtract(char x, char y){
        if((x=='I' && (y=='V' || y=='X')) || (x=='X' && (y=='L' || y=='C')) || (x=='C' && (y=='D' || y=='M')))
            return true;
        return false;
    }

    public static int romanToInt(String s) {
        if(s.length() < 1 || s.length() > 15)
            return 0;
        int i,sum=0;
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        for(i = 0; i < s.length(); i++){
            sum += i<s.length()-1 && subtract(s.charAt(i),s.charAt(i+1)) ? -roman.get(s.charAt(i)) : roman.get(s.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int x = romanToInt(s);
        System.out.println(x);
    }
}
