package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.Scanner;

public class ConstructProductMatrix {

    public static int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int[][] result = new int[n][m];

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                result[i][j] = (int) suffix;
                suffix = (suffix * grid[i][j]) % MOD;
            }
        }

        long prefix = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = (int) (((long) result[i][j] * prefix) % MOD);
                prefix = (prefix * grid[i][j]) % MOD;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] matrix = new int[st.length][];
        for(int i = 0; i < st.length; i++){
            String[] col = st[i].split(",");
            matrix[i] = new int[col.length];
            for(int j = 0; j < col.length; j++)
                matrix[i][j] = Integer.parseInt(col[j]);
        }
        int[][] result = constructProductMatrix(matrix);
        for(int i = 0; i < result.length; i++){
            for(int v : result[i])
                System.out.print(v+",");
            System.out.println();
        }
    }
}
