package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c=='('){
                st.push(')');
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty() || c!=st.pop()) {
                return false;
            }
        }
        if(st.isEmpty())
            return true;
        else return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isValid(s));
    }
}
