package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            map.put(score[i],i);
            q.add(score[i]);
        }
        int rank = 1, idx;
        while(!q.isEmpty()){
            idx = map.get(q.poll());
            if(rank == 1) {
                ans[idx] = "Gold Medal";
            } else if(rank == 2){
                ans[idx] = "Silver Medal";
            } else if(rank == 3){
                ans[idx] = "Bronze Medal";
            } else{
                ans[idx] = rank + "";
            }
            rank++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] score = new int[st.length];
        for(int i = 0; i < st.length; i++){
            score[i] = Integer.parseInt(st[i]);
        }
        String[] ans = findRelativeRanks(score);
        for(String a: ans)
            System.out.println(a);
    }
}
