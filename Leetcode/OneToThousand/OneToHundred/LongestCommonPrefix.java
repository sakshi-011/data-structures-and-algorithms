package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        char ch;
        int i=0, p=0;
        while(p < strs[0].length()) {
            for (i = 0; i < strs.length; i++) {
                ch = strs[0].charAt(p);
                if (p >= strs[i].length() || strs[i].charAt(p) != ch) {
                    return strs[0].substring(0, p);
                }
            }
            p++;
        }
        return strs[0].substring(0,p);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = in.next();
        }
        System.out.println(longestCommonPrefix(s));
    }

}
