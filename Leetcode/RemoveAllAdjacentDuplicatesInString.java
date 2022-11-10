package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeAllAdjacentDuplicates(String s){
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            res=st.pop()+res;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(removeAllAdjacentDuplicates(s));
    }

}
