package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class MakeStringASubsequenceUsingCyclicIncrements {

    public static boolean canMakeSubsequence(String str1, String str2) {
        int ptr1 = 0, ptr2 = 0, len1 = str1.length(), len2 = str2.length();
        if(len2 > len1)
            return false;
        while(ptr1 < len1 && ptr2 < len2){
            char c1 = str1.charAt(ptr1), c2 = str2.charAt(ptr2);
            if(c1 == 'z' && c2 == 'a'){
                ptr2++;
            } else if(c1 == c2 || ++c1 == c2){
                ptr2++;
            }
            ptr1++;
        }
        if(ptr2 == len2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.next();
        System.out.println(canMakeSubsequence(str1, str2));
    }
}
