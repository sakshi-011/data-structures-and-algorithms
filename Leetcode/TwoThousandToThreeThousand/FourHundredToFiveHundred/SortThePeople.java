package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Collections;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length, ptr = 0;
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            map.put(heights[i],names[i]);
        }
        String[] sortedList = new String[n];
        Set<Map.Entry<Integer, String> > entries = map.entrySet();
        for(Map.Entry<Integer,String> e : entries){
            sortedList[ptr++] = e.getValue();
        }
        return sortedList;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] names = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] heights = new int[st.length];
        for(int i = 0; i < st.length; i++){
            heights[i] = Integer.parseInt(st[i]);
        }
        String[] sortedList = sortPeople(names,heights);
        for(String name : sortedList){
            System.out.print(name+" ");
        }
    }
}
