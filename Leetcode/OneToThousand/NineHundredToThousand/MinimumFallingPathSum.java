package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumFallingPathSum {

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int minOfAbove3 = matrix[i - 1][j];
                if (j > 0 && matrix[i - 1][j - 1] < minOfAbove3) {
                    minOfAbove3 = matrix[i - 1][j - 1];
                }
                if (j + 1 < n && matrix[i - 1][j + 1] < minOfAbove3) {
                    minOfAbove3 = matrix[i - 1][j + 1];
                }
                matrix[i][j] += minOfAbove3;
            }
        }
        return  Arrays.stream(matrix[n - 1]).min().getAsInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").replaceAll("]]","").split("],");
        int[][] mat = new int[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            String[] row = str[i].split(",");
            for (int j = 0; j < row.length; j++) {
                mat[i][j] = Integer.parseInt(row[j]);
            }
        }
        int ans = minFallingPathSum(mat);
        System.out.println(ans);
    }

}
