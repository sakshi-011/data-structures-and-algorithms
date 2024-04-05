package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        if(s.length() <= 1)
            return s;
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            } else if(st.peek() - 'a' == c - 'A' || st.peek() - 'A' == c - 'a') {
                    st.pop();
            } else {
                st.push(c);
            }
        }
        for(Character t : st) {
            ans += t;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(makeGood(s));
    }
}
