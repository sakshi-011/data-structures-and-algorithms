package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;

public class CheckIfStringIsAPrefixOfArray {

    public static boolean isPrefixString(String s, String[] words) {
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i];
            if(s.equals(res))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str = in.next();
        String[] words = str.replaceAll("\\[","").replaceAll("]","").replaceAll("\"","").split(",");
        System.out.println(isPrefixString(s,words));
    }

}
