package Leetcode.ThreeThousandToFourThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class FindTheMostCommonResponse {

    public static String findCommonResponse(List<List<String>> responses) {
        List<Set<String>> listOfSet = new ArrayList<>();
        for(List<String> st : responses){
            Set<String> set = new HashSet<>();
            for(String s : st){
                set.add(s);
            }
            listOfSet.add(set);
        }
        Map<String, Integer> count = new HashMap<>();
        int max = 0, curr =0;
        for(Set<String> st : listOfSet){
            for(String s : st){
                curr = count.getOrDefault(s,0) + 1;
                count.put(s, curr);
                max = Math.max(max, curr);
            }
        }
        String ans = "";
        for(Map.Entry<String,Integer> entry : count.entrySet()){
            if(entry.getValue() == max){
                if(ans.isEmpty()){
                    ans = entry.getKey();
                } else {
                    ans = ans.compareTo(entry.getKey()) > 0 ? entry.getKey() : ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[\"","").replaceAll("\"]]","").split("\"],\\[\"");
        List<List<String>> responses = new ArrayList<>();
        for(String t : st){
            List<String> l = new ArrayList<>();
            String[] z = t.split("\",\"");
            for(String y : z)
                l.add(y);
            responses.add(l);
        }
        System.out.println(findCommonResponse(responses));
    }
}
