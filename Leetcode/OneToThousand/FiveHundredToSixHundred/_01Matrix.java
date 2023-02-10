package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Arrays;

public class _01Matrix {

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length, max = m + n + 1;
        int[][] dist = new int[m][n];
        for (int[] arr : dist) {
            Arrays.fill(arr,max);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == 0)
                    dist[i][j] = 0;
                else
                    dist[i][j] = Math.min(dist[i][j],Math.min(i>0 ? dist[i-1][j]+1 : max, j>0 ? dist[i][j-1]+1 : max));
            }
        }
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                dist[i][j] = Math.min(dist[i][j],Math.min(i<m-1 ? dist[i+1][j]+1 : max, j<n-1 ? dist[i][j+1]+1 : max));
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] mat = new int[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            for (int j = 0; j < str.length; j++) {
                mat[i][j] = Integer.valueOf(st[j]);
            }
        }
        int[][] ans = updateMatrix(mat);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}
