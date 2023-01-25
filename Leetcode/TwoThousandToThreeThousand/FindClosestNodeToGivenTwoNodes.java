package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Arrays;

public class FindClosestNodeToGivenTwoNodes {

    public static void bfs(int startNode, int[] edges, int[] dist) {
        int n = edges.length;
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNode);

        Boolean[] visit = new Boolean[n];
        Arrays.fill(visit, Boolean.FALSE);
        dist[startNode] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            if (visit[node]) {
                continue;
            }

            visit[node] = true;
            int neighbor = edges[node];
            if (neighbor != -1 && !visit[neighbor]) {
                dist[neighbor] = 1 + dist[node];
                q.offer(neighbor);
            }

        }
    }

    public static int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n], dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);

        bfs(node1, edges, dist1);
        bfs(node2, edges, dist2);

        int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
                minDistNode = currNode;
                minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
            }
        }

        return minDistNode;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] edges = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            edges[i] = Integer.valueOf(str[i]);
        }
        int node1 = in.nextInt();
        int node2 = in.nextInt();
        System.out.println(closestMeetingNode(edges,node1,node2));
    }

}
