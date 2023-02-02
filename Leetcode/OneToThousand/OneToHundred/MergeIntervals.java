package Leetcode.OneToThousand.OneToHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        int n = intervals.length;
        int[] prev = intervals[0];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(Math.min(prev[1],intervals[i][1])-Math.max(prev[0],intervals[i][0]) < 0){
                list.add(prev);
                prev = intervals[i];
            }else{
                prev = new int[]{Math.min(prev[0], intervals[i][0]), Math.max(prev[1], intervals[i][1])};
            }
        }
        list.add(prev);
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] intervals = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            intervals[i][0] = Integer.valueOf(st[0]);
            intervals[i][1] = Integer.valueOf(st[1]);
        }
        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            System.out.println("["+ans[i][0]+","+ans[i][1]+"]");
        }
    }

}
