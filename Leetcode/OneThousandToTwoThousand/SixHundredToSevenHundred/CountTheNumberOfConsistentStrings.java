package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray())
            set.add(c);
        int count = 0;
        boolean consistent = true;
        for(String word : words){
            consistent = true;
            for(char c : word.toCharArray())
                if(!set.contains(c)) {
                    consistent = false;
                    break;
                }
            if(consistent)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String s = in.next();
        String[] words = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        System.out.println(countConsistentStrings(a,words));
    }
}
