package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class VerifyingAnAlienDictionary {

    public static boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1)
            return true;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i),i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j >= words[i + 1].length())
                    return false;
                if(words[i].charAt(j) != words[i + 1].charAt(j)){
                    if (map.get(words[i].charAt(j)) > map.get(words[i + 1].charAt(j)))
                        return false;
                    else break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] words = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        String order = in.next();
        System.out.println(isAlienSorted(words,order));
    }

}
