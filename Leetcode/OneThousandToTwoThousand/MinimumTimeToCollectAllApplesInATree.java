package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MinimumTimeToCollectAllApplesInATree {

    public static int dfs(int node, int parent, Map<Integer,ArrayList<Integer>> map, List<Boolean> hasApple){
        if(!map.containsKey(node))
            return 0;
        int total = 0, childTime = 0;
        for(int child : map.get(node)){
            if(child == parent)
                continue;
            childTime = dfs(child, node, map, hasApple);
            if(childTime > 0 || hasApple.get(child))
                total += childTime + 2;
        }
        return total;
    }

    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for (int[] e : edges) {
            int a = e[0], b = e[1];
            map.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            map.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        return dfs(0, -1, map, hasApple);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] edges = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            for (int j = 0; j < st.length; j++) {
               edges[i][j] = Integer.valueOf(st[j]);
            }
        }
        List<Boolean> hasApple = new ArrayList<>();
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        for(String i : str){
            hasApple.add(Boolean.parseBoolean(i));
        }
        System.out.println(minTime(n, edges, hasApple));
    }

}
