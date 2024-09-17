package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class UncommonWordsFromTwoSentences {

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String t : words1){
            map.put(t, map.getOrDefault(t,0)+1);
        }
        for(String t : words2){
            map.put(t, map.getOrDefault(t,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() == 1)
                list.add(e.getKey());
        }
        String[] ans = new String[list.size()];
        list.toArray(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] ans = uncommonFromSentences(s1,s2);
        for(String t : ans)
            System.out.print(t+" ");
    }
}
