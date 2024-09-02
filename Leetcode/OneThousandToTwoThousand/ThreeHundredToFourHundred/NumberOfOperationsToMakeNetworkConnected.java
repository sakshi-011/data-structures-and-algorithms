package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class NumberOfOperationsToMakeNetworkConnected {

    public static int findParent(int[] parent, int i) {
        while (i != parent[i])
            i = parent[i];
        return i;
    }

    public static int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1)
            return -1;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int ans = n;
        for(int[] con : connections){
            int p1 = findParent(parent, con[0]);
            int p2 = findParent(parent, con[1]);
            if(p1 != p2){
                parent[p1] = p2;
                ans--;
            }
        }
        return ans-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] connections = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            connections[i][0] = Integer.valueOf(st[0]);
            connections[i][1] = Integer.valueOf(st[1]);
        }
        System.out.println(makeConnected(n,connections));
    }
}
