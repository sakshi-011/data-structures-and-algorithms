package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class LargestLocalValuesInAMatrix {

    private static int findMax(int[][] grid, int x, int y) {
        int maxElement = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }
        return maxElement;
    }

    public static int[][] largestLocal(int[][] grid) {
        int N = grid.length;
        int[][] maxLocal = new int[N - 2][N - 2];
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                maxLocal[i][j] = findMax(grid, i, j);
            }
        }
        return maxLocal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int n = st.length;
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] row = st[i].split(",");
            for(int j = 0; j < n; j++)
                matrix[i][j] = Integer.parseInt(row[j]);
        }
        int[][] maxLocal = largestLocal(matrix);
        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < n-2; j++)
                System.out.print(maxLocal[i][j]+" ");
            System.out.println();
        }
    }
}
