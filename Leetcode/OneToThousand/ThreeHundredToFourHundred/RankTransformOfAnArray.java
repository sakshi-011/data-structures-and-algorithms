package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class RankTransformOfAnArray {

    public static int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            if(!map.containsKey(x))
                map.put(x, new ArrayList<>());
            map.get(x).add(i);
        }
        int rank = 1;
        for (int num : map.keySet()) {
            for (int index : map.get(num)) {
                arr[index] = rank;
            }
            rank++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int[] ans = arrayRankTransform(nums);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
