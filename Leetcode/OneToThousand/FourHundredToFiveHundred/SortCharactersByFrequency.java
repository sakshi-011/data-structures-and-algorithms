package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        String ans="";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        SortedMap<Integer,String> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry el : mp.entrySet()){
            String temp = (Character) el.getKey()+"";
            int idx = (int)el.getValue();
            sortedMap.put(idx,sortedMap.getOrDefault(idx,"")+temp.repeat(idx));
        }
        for(Map.Entry el : sortedMap.entrySet()){
            ans+=el.getValue();
        }
        return ans;
    }
    
    /* Alternate solution
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> (map.get(b) - map.get(a)));

        StringBuilder sb = new StringBuilder();
        for(Character c: list){
            for(int i=0; i<map.get(c); i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
     */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(frequencySort(s));
    }

}
