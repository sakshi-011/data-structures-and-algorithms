package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Deque;
import java.util.ArrayDeque;

public class MinimumScoreOfAPathBetweenTwoCities {

    public static int minScore(int n, int[][] roads) {
        Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        for (int[] road : roads) {
            int u = road[0], v = road[1], w = road[2];
            adj.computeIfAbsent(u, k -> new HashMap<>()).put(v, w);
            adj.computeIfAbsent(v, k -> new HashMap<>()).put(u, w);
        }

        int ans = Integer.MAX_VALUE;
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (Map.Entry<Integer, Integer> entry : adj.get(v).entrySet()) {
                int node = entry.getKey(), score = entry.getValue();
                if (!visited.contains(node)) {
                    queue.offer(node);
                    visited.add(node);
                }
                ans = Math.min(ans, score);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] roads = new int[str.length][3];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            roads[i][0] = Integer.valueOf(st[0]);
            roads[i][1] = Integer.valueOf(st[1]);
            roads[i][2] = Integer.valueOf(st[2]);
        }
        System.out.println(minScore(n,roads));
    }

}
