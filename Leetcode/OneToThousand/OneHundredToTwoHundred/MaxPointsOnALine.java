package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.*;

public class MaxPointsOnALine {

    public static int maxPoints(int[][] points) {
        int n = points.length, res = 2;
        if(n == 1) return 1;
        for (int i = 0; i < n; i++) {
            Map<Double,Integer> mp = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if(j!=i){
                    mp.merge(Math.atan2(points[j][1]-points[i][1],points[j][0]-points[i][0]),1,Integer::sum);
                }
            }
            res = Math.max(res,Collections.max(mp.values())+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            ArrayList<Integer> l = new ArrayList<>();
            for (int j = 0; j < st.length; j++) {
                l.add(Integer.valueOf(st[j]));
            }
            list.add(l);
        }
        int[][] points = list.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        System.out.println(maxPoints(points));
    }

}
