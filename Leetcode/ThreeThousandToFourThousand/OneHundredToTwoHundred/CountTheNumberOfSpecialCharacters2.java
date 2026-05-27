package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberOfSpecialCharacters2 {

    public static int numberOfSpecialChars(String word) {
        char[] ar = word.toCharArray();
        int n = ar.length, count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(ar[i] >= 'a' && ar[i] <= 'z')
                map.put(ar[i],i);
            else
                map.putIfAbsent(ar[i],i);
        }
        for(char c = 'A'; c <= 'Z'; c++){
            int cap = map.getOrDefault(c,-1), small = map.getOrDefault((char) (c - 'A' + 'a'),-1);
            if(cap > -1 && small > -1)
                if(cap > small)
                    count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(numberOfSpecialChars(s));
    }
}
