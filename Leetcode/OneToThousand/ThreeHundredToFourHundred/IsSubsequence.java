package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(s.length()==i) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(isSubsequence(s,t));
    }

}
