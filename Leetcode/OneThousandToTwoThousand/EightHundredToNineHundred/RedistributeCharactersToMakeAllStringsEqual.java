package Leetcode.OneThousandToTwoThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class RedistributeCharactersToMakeAllStringsEqual {

    public static boolean makeEqual(String[] words) {
        int n = words.length;
        int[] count = new int[26];
        for(String word : words){
            for(int j = 0; j < word.length(); j++){
                count[word.charAt(j)-'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(count[i] % n != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[\"", "").replaceAll("\"]", "").split("\",\"");
        System.out.println(makeEqual(str));
    }
}
