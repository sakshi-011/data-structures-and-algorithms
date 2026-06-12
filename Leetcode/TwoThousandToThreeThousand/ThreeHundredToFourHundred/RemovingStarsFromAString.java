package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import java.util.Stack;

public class RemovingStarsFromAString {

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!(c == '*'))
                st.push(c);
            else
                st.pop();
        }
        String ans = "";
        for(char c : st){
            ans += ""+c;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
        System.out.println(removeStars("d*sjhfkuhb****ttt"));
    }
}
