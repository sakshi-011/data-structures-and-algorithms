package Leetcode.OneToThousand.OneToHundred;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        int[] merge = newInterval;
        for (int i = 0; i < n; i++) {
            if(Math.min(merge[1],intervals[i][1])-Math.max(merge[0],intervals[i][0]) >= 0){
                    merge[0] = Math.min(intervals[i][0], merge[0]);
                    merge[1] = Math.max(intervals[i][1], merge[1]);
            }else{
                if(merge[1] < intervals[i][0] && !list.contains(merge))
                    list.add(merge);
                list.add(intervals[i]);
            }
        }
        if(!list.contains(merge)){
            list.add(merge);
        }
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").split("],");
        int[][] intervals = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            for (int j = 0; j < 2; j++) {
                intervals[i][j] = Integer.parseInt(st[j]);
            }
        }

        int[] newInterval = new int[2];
        s = in.next();
        str = s.replaceAll("\\[","").replaceAll("]","").split(",");
        newInterval[0] = Integer.parseInt(str[0]);
        newInterval[1] = Integer.parseInt(str[1]);

        int[][] ans = insert(intervals,newInterval);
        System.out.println(Arrays.deepToString(ans));
    }

}
