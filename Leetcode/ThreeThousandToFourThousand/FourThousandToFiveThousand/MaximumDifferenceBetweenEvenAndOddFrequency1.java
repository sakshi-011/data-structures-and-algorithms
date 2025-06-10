package Leetcode.ThreeThousandToFourThousand.FourThousandToFiveThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MaximumDifferenceBetweenEvenAndOddFrequency1 {

    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int min = Integer.MAX_VALUE, max = 0;
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() % 2 == 1)
                max = Math.max(max, e.getValue());
            else
                min = Math.min(min, e.getValue());
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(maxDifference(s));
    }
}
