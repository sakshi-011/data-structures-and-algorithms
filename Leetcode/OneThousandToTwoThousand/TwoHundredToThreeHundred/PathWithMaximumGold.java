package Leetcode.OneThousandToTwoThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class PathWithMaximumGold {

    private static final int[] DIRECTIONS = new int[] { 0, 1, 0, -1, 0 };

    public static int getMaximumGold(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxGold = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                maxGold = Math.max(maxGold, dfsBacktrack(grid, rows, cols, row, col));
            }
        }
        return maxGold;
    }

    private static int dfsBacktrack(int[][] grid, int rows, int cols, int row, int col) {
        if (row < 0 || col < 0 || row == rows || col == cols || grid[row][col] == 0) {
            return 0;
        }
        int maxGold = 0;
        int originalVal = grid[row][col];
        grid[row][col] = 0;

        for (int direction = 0; direction < 4; direction++) {
            maxGold = Math.max(maxGold, dfsBacktrack(grid, rows, cols, DIRECTIONS[direction] + row, DIRECTIONS[direction + 1] + col));
        }
        grid[row][col] = originalVal;
        return maxGold + originalVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int m = st.length, n = st[0].split(",").length;
        int[][] grid = new int[m][n];
        for(int i = 0; i < m; i++){
            String[]  t = st[i].split(",");
            for(int j = 0; j < n; j++)
                grid[i][j] = Integer.parseInt(t[j]);
        }
        System.out.println(getMaximumGold(grid));
    }
}
