package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class DetectCapital {

    /*
     public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
     */

    public static boolean detectCapitalUse(String word) {
        if(word.length()==0 || word.length()==1) return true;
        int u=0, l=0;
        boolean f = Character.isUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            Character c = word.charAt(i);
            if(Character.isLowerCase(c)){
                l++;
            }else{
                u++;
            }
            if(u>0 && l>0) return false;
            if(!f && u>0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(detectCapitalUse(s));
    }

}
