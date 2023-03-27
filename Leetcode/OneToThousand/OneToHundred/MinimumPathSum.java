package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i==0 && j==0)
                    grid[i][j] = grid[i][j];
                else if(i==0 && j!=0)
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                else if(i!=0 && j==0)
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                else
                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[r-1][c-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.valueOf(st[j]);
            }
        }
        System.out.println(minPathSum(grid));
    }

}
