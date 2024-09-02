package Leetcode.OneThousandToTwoThousand.SevenHundredToEightHundred;

import java.util.Scanner;
public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        boolean b = word1.length() < word2.length();
        int l = b ? word1.length() : word2.length();
        String ans = "";
        for(int i = 0; i < l; i++){
            ans+= "" +word1.charAt(i) + word2.charAt(i);
        }
        if(b){
            ans += word2.substring(l);
        }else{
            ans+= word1.substring(l);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        System.out.println(mergeAlternately(word1, word2));
    }

}
