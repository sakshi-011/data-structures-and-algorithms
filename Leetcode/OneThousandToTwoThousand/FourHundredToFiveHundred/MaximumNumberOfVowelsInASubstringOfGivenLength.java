package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static int maxVowels(String s, int k) {
        int count = 0, maxCount = 0;
        char[] ch = s.toCharArray();
        Set<Character> vowels = Set.of('a','e','i','o','u');
        for(int i = 0; i < k; i++){
            if(vowels.contains(ch[i]))
                count++;
        }
        maxCount = Math.max(count, maxCount);
        for(int i = k; i < ch.length; i++){
            if(vowels.contains(ch[i-k]))
                count--;
            if(vowels.contains(ch[i]))
                count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels("aeiou",2));
        System.out.println(maxVowels("leetcode",3));
    }
}
