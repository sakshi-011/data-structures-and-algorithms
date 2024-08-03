package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MakeTwoArraysEqualByReversingSubarrays {

    public static boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : target)
            map.put(x,map.getOrDefault(x,0)+1);
        for(int x : arr){
            if(!map.containsKey(x))
                return false;
            if(map.get(x) <= 0)
                return false;
            map.put(x, map.get(x)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] target = new int[st.length];
        for(int i = 0; i < st.length; i++){
            target[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] arr = new int[st.length];
        for(int i = 0; i < st.length; i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        System.out.println(canBeEqual(target,arr));
    }
}
