package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class ReverseWordsInAString {

    public static String reverseWords(String s){
        String res = "";
        String words[] = s.trim().replaceAll("[ ]+", " ").split(" ");
        for(String x : words){
            res = x+" "+res;
        }
        return res.trim();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseWords(s));
    }

}
