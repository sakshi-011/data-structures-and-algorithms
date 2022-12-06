package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i), ch=t.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(ch))
                    return false;
                map.put(c,t.charAt(i));
            }
            else if(map.get(c)!=ch){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(isIsomorphic(s,t));
    }

}
