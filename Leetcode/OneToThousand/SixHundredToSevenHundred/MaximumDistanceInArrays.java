package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MaximumDistanceInArrays {

    public static int maxDistance(List<List<Integer>> arrays) {
        int diff = Integer.MIN_VALUE;
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);

        for (int i = 1; i < arrays.size(); i++) {
            diff = Math.max(diff, Math.abs(arrays.get(i).get(0) - max));
            diff = Math.max(diff, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - min));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        List<List<Integer>> arrays = new ArrayList<>();
        for(int i = 0; i < st.length; i++){
            String[] temp = st[i].split(",");
            List<Integer> l = new ArrayList<>();
            for(String a : temp)
                l.add(Integer.parseInt(a));
            arrays.add(l);
        }
        System.out.println(maxDistance(arrays));
    }
}
