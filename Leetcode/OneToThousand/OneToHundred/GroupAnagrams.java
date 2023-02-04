package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0)
            return ans;

        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String t = new String(temp);
            if(!map.containsKey(t))
                map.put(t,new ArrayList<>());
            map.get(t).add(strs[i]);
        }
        ans = new ArrayList(map.values());
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] strs = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        List<List<String>> ans = groupAnagrams(strs);
        for(List<String> l : ans)
            System.out.println(l.toString());
    }

}
