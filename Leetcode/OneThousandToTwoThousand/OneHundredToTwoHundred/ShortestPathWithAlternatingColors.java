package Leetcode.OneThousandToTwoThousand.OneHundredToTwoHundred;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ShortestPathWithAlternatingColors {

    public static int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] ans = new int[n];
        if(n==1)
            return ans;
        Arrays.fill(ans,-1);

        Map<Integer,List<List<Integer>>> adj = new HashMap<>();
        for(int[] edge : redEdges){
            adj.computeIfAbsent(edge[0],val -> new ArrayList<>()).add(Arrays.asList(edge[1],0));
        }
        for(int[] edge : blueEdges){
            adj.computeIfAbsent(edge[0],val -> new ArrayList<>()).add(Arrays.asList(edge[1],1));
        }
        boolean[][] visited = new boolean[n][2];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0,-1});
        ans[0] = 0;
        visited[0][0] = visited[0][1] = true;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int node = arr[0], steps = arr[1], prevColor = arr[2];
            if(!adj.containsKey(node))
                continue;
            for(List<Integer> list : adj.get(node)){
                int neighbour = list.get(0);
                int color = list.get(1);
                if(!visited[neighbour][color] && color != prevColor){
                    if(ans[neighbour] == -1)
                        ans[neighbour] = steps + 1;
                    visited[neighbour][color] = true;
                    q.offer(new int[]{neighbour, steps + 1, color});
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] redEdges = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            if(st[0].isEmpty())
                break;
            redEdges[i][0] = Integer.valueOf(st[0]);
            redEdges[i][1] = Integer.valueOf(st[1]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").split("],");
        int[][] blueEdges = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            if(st[0].isEmpty())
                break;
            blueEdges[i][0] = Integer.valueOf(st[0]);
            blueEdges[i][1] = Integer.valueOf(st[1]);
        }
        int[] ans = shortestAlternatingPaths(n,redEdges,blueEdges);
        for(int x : ans)
            System.out.print(x+" ");
    }

}
