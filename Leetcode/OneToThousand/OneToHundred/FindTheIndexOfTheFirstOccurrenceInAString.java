package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        int ptr = 0, i;
        for (i = 0; i < haystack.length(); i++) {
            if(ptr == needle.length())
                return i - ptr;
            if(haystack.charAt(i) == needle.charAt(ptr)){
                ptr++;
            }else{
                if(ptr>=1){
                    i = i - ptr;
                }
                ptr = 0;
            }
        }
        if(ptr == needle.length())
            return i - ptr;
        return -1;
    }

    /*
    public static int strStr(String haystack, String needle) {
        Pattern p = Pattern.compile(needle);
        Matcher m = p.matcher(haystack);
        if(m.find()){
            return m.start();
        }
        return -1;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String haystack = in.next();
        String needle = in.next();
        System.out.println(strStr(haystack,needle));
    }

}
