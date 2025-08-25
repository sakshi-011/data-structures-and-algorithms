package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat[0].length, n = mat.length;
        int row = 0, column = 0 , dir = 1, i =0;
        int[] ans = new int[m * n];

        while (row < n && column < m) {

            ans[i++] = mat[row][column];
            int new_row = row + (dir == 1 ? -1 : 1);
            int new_column = column + (dir == 1 ? 1 : -1);

            if (new_row < 0 || new_row == n || new_column < 0 || new_column == m) {
                if (dir == 1) {
                    row += (column == m - 1 ? 1 : 0) ;
                    column += (column < m - 1 ? 1 : 0);
                } else {
                    column += (row == n - 1 ? 1 : 0);
                    row += (row < n - 1 ? 1 : 0);
                }
                dir = 1 - dir;
            } else {
                row = new_row;
                column = new_column;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        String[] temp = st[0].split(",");
        int m = st.length, n = temp.length;
        int[][] nums = new int[m][n];
        for(int i = 0; i < m; i++){
            String[] str = st[i].split(",");
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(str[j]);
            }
        }
        int[] ans = findDiagonalOrder(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
