package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import javafx.util.Pair;

public class CountNumberOfPossibleRootNodes {

    private static int[] parents;
    static int answer=0;
    static int k;
    static List<List<Integer>> tree;
    static List<HashSet<Integer>> guess_graph;

    private static void dfs(int node, int parent,int correct_guesses){
        int cur = correct_guesses;
        if(guess_graph.get(parent).contains(node))
            cur--;
        if(guess_graph.get(node).contains(parent))
            cur++;
        if(cur >= k)
            answer++;
        for(int child: tree.get(node)){
            if(child != parent)
                dfs(child,node,cur);
        }
    }

    private static void fill_parent(int node,int parent){
        parents[node] = parent;
        for(int child: tree.get(node)){
            if(child == parent)
                continue;
            fill_parent(child,node);
        }
    }

    public static int rootCount(int[][] edges, int[][] guesses, int x) {
        tree = new ArrayList<>();
        guess_graph = new ArrayList<>();
        k = x;
        int n = edges.length+1;

        for(int i=0;i<n;i++) {
            tree.add(new ArrayList<>());
            guess_graph.add(new HashSet<>());
        }
        for(int[] edge: edges){
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        for(int[] g: guesses){
            guess_graph.get(g[0]).add(g[1]);
        }

        parents = new int[n];
        int correct_guesses = 0;
        fill_parent(0,-1);
        for(int i=1;i<n;i++){
            int p = parents[i];
            if(guess_graph.get(p).contains(i))
                correct_guesses++;
        }
        if(correct_guesses >= k)
            answer++;
        for(int c: tree.get(0))
            dfs(c,0, correct_guesses);
        return answer;
    }

    /* TLE
    public static boolean bfs(Map<Integer,List<Integer>> adj, int root, Set<Pair<Integer,Integer>> set, int k){
        Queue<Integer> q = new LinkedList<>();
        q.offer(root);
        boolean[] visited = new boolean[adj.size()];
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            if(!adj.containsKey(node) || visited[node])
                continue;
            for(int v : adj.get(node)){
                if(visited[v])
                    continue;
                if(set.contains(new Pair<>(node,v)))
                    count++;
                if(count >= k)
                    return true;
                q.offer(v);
            }
            visited[node] = true;
        }
        return count >= k;
    }

    public static int rootCount(int[][] edges, int[][] guesses, int k) {
        Map<Integer,List<Integer>> adj = new HashMap<>();
        int max = 0, ans = 0;
        for(int[] e : edges){
            adj.computeIfAbsent(e[0],val -> new ArrayList<Integer>()).add(e[1]);
            adj.computeIfAbsent(e[1],val -> new ArrayList<Integer>()).add(e[0]);
            max = Math.max(max,Math.max(e[0],e[1]));
        }
        Set<Pair<Integer,Integer>> set = new HashSet<>();
        for(int[] e : guesses){
            Pair<Integer,Integer> p = new Pair<>(e[0],e[1]);
            set.add(p);
        }
        for(int i = 0; i <= max; i++){
            if(bfs(adj,i,set,k))
                ans++;
        }
        return ans;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] edges = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            edges[i][0] = Integer.valueOf(st[0]);
            edges[i][1] = Integer.valueOf(st[1]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").split("],");
        int[][] guesses = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            guesses[i][0] = Integer.valueOf(st[0]);
            guesses[i][1] = Integer.valueOf(st[1]);
        }
        int k = in.nextInt();
        System.out.println(rootCount(edges,guesses,k));
    }

}
