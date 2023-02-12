package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MinimumFuelCostToReportToTheCapital {

    static long ans;

    public static long dfs(int parent, int node, Map<Integer,List<Integer>> adj, int seats){
        long childAns = 1;
        if(!adj.containsKey(node))
            return childAns;
        for(int child : adj.get(node)){
            if(child==parent)
                continue;
            childAns += dfs(node,child,adj,seats);
        }
        if(node != 0)
            ans += Math.ceil((double) childAns / seats);
        return childAns;
    }

    public static long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length;
        if(n == 0)
            return 0;
        Map<Integer,List<Integer>> adj = new HashMap<>();
        for(int[] road : roads){
            adj.computeIfAbsent(road[0],val -> new ArrayList<>()).add(road[1]);
            adj.computeIfAbsent(road[1],val -> new ArrayList<>()).add(road[0]);
        }
        dfs(-1,0,adj,seats);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] roads = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            if(st[0].isEmpty())
                continue;
            roads[i][0] = Integer.valueOf(st[0]);
            roads[i][1] = Integer.valueOf(st[1]);
        }
        int seats = in.nextInt();
        System.out.println(minimumFuelCost(roads,seats));
    }

}
