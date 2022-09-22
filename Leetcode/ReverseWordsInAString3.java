package Leetcode;

import java.util.Scanner;

public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans = "";
        char ch;
        for(String t : str){
            String rev = "";
            for(int i=0; i<t.length(); i++){
                ch = t.charAt(i);
                rev=ch+rev;
            }
            ans+=rev+" ";
        }
        return ans.trim();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseWords(s));
    }
}
