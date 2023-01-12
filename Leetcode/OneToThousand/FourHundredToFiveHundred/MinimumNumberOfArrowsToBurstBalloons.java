package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfArrowsToBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> {
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        if(points.length==1) return 1;
        int endLimit = points[0][1], res = 1;
        for (int i = 0; i < points.length; i++) {
            int start = points[i][0];
            int end = points[i][1];
            if(start <= endLimit){
                endLimit = Math.min(endLimit,end);
            }else{
                res++;
                endLimit = end;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] strs = s.split("],");
        int[][] points = new int[strs.length][2];
        for (int i = 0; i < strs.length; i++) {
            String[] str = strs[i].replaceAll("\\[","").replaceAll("]","").split(",");
            for (int j = 0; j < str.length; j++) {
                points[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(findMinArrowShots(points));
    }

}
