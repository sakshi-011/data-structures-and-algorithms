package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;
import java.util.Arrays;

public class AsFarFromLandAsPossible {

    public static int maxDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length, max = m + n + 1, ans = Integer.MIN_VALUE;
        int[][] dist = new int[m][n];
        for(int[] arr : dist)
            Arrays.fill(arr,max);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    dist[i][j] = 0;
                }
                else{
                    dist[i][j] = Math.min(dist[i][j],Math.min(i>0 ? dist[i-1][j]+1 : max, j>0 ? dist[i][j-1]+1 : max));
                }
            }
        }

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                dist[i][j] = Math.min(dist[i][j],Math.min(i<m-1 ? dist[i+1][j]+1 : max,j<n-1 ? dist[i][j+1]+1 : max));
                ans = Math.max(ans,dist[i][j]);
            }
        }
        return ans == 0 || ans == max ? -1 : ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] grid = new int[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            for (int j = 0; j < str.length; j++) {
                grid[i][j] = Integer.valueOf(st[j]);
            }
        }
        System.out.println(maxDistance(grid));
    }

}
