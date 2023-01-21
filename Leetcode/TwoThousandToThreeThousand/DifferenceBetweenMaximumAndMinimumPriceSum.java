package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DifferenceBetweenMaximumAndMinimumPriceSum {

    static long[] subtreeSum;
    static long ans = 0L;

    public static long calcSum(int node, int parent, Map<Integer,ArrayList<Integer>> adj, int[] price){
        long m = 0L;
        for(int child: adj.get(node)){
            if(child == parent)
                continue;
            m  = Math.max(m, calcSum(child,node,adj,price));
        }
        return subtreeSum[node] = price[node] + m;
    }

    public static void dfs(int node, int parent, Map<Integer,ArrayList<Integer>> adj, int[] price, long parentVal){
        int c1 = -1;
        long max = 0, secondMax = 0;
        for(int child: adj.get(node)){
            if(child == parent)
                continue;
            if(subtreeSum[child] > max){
                secondMax = max;
                c1 = child;
                max = subtreeSum[child];
            }
            else if(subtreeSum[child] > secondMax){
                secondMax = subtreeSum[child];
            }
        }
        long path1 = max;
        long path2 = parentVal;
        ans = Math.max(ans,Math.max(path1,path2));
        for(int child: adj.get(node)){
            if(child == parent)
                continue;
            if(c1 == child)
                dfs(child,node,adj,price,price[node]+Math.max(secondMax,parentVal));
            else
                dfs(child,node,adj,price,price[node]+Math.max(max,parentVal));
        }
    }

    public static long maxOutput(int n, int[][] edges, int[] price) {
        if(n==1)
            return 0;
        Map<Integer,ArrayList<Integer>> adj = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            adj.computeIfAbsent(a,value -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b,value -> new ArrayList<Integer>()).add(a);
        }
        subtreeSum = new long[n];
        calcSum(0,-1,adj,price);
        dfs(0,-1,adj,price,0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] edges = {{0,1},{1,2},{1,3},{3,4},{3,5}};
        int[] price = {9,8,7,6,10,5};
        System.out.println(maxOutput(n,edges,price));
    }

}
