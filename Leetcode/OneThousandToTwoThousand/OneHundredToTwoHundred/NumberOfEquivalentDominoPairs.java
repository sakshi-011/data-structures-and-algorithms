package Leetcode.OneThousandToTwoThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {

    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int[] n : dominoes){
            String s = "";
            if(n[1] < n[0])
                s = "" + n[1] + n[0];
            else
                s = "" + n[0] + n[1];
            int i = map.getOrDefault(s,0);
            count += i;
            map.put(s, i + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] nums = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String t[] = st[i].split(",");
            nums[i][0] = Integer.parseInt(t[0]);
            nums[i][1] = Integer.parseInt(t[1]);
        }
        System.out.println(numEquivDominoPairs(nums));
    }
}
