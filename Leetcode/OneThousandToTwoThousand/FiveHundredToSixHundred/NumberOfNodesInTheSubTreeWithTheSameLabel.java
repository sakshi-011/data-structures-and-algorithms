package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfNodesInTheSubTreeWithTheSameLabel {

    public static int[] dfs(int node, int parent, Map<Integer,ArrayList<Integer>> adj, String l, int[] res){
        int[] nodeCount = new  int[26];
        nodeCount[l.charAt(node) - 'a'] = 1;

        if(!adj.containsKey(node))
            return nodeCount;
        for(int child : adj.get(node)){
            if(child == parent)
                continue;
            int[] subtreeCount = dfs(child,node,adj,l,res);
            for (int i = 0; i < 26; i++) {
                nodeCount[i] += subtreeCount[i];
            }
        }
        res[node] = nodeCount[l.charAt(node) - 'a'];
        return nodeCount;
    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer,ArrayList<Integer>> adj = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            adj.computeIfAbsent(a,value -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        int[] res = new int[n];
        dfs(0,-1,adj,labels, res);
        return res;
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
        s = in.next();
        String labels = s.replaceAll("\"","");
        int[] ans = countSubTrees(n, edges, labels);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }

}
