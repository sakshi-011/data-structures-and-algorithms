package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] st = s.split(" ");
        if(pattern.length()!=st.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(st[i]))
                    return false;
            } else{
                if(map.containsValue(st[i]))
                    return false;
                map.put(ch,st[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        String s = in.nextLine();
        System.out.println(wordPattern(p,s));
    }

}
