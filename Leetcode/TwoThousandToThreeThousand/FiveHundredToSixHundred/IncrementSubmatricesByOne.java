package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Arrays;

public class IncrementSubmatricesByOne {

    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][2]; j++) {
                for (int k = queries[i][1]; k <= queries[i][3]; k++) {
                    ans[j][k] += 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] q = {{1,1,2,2},{0,0,1,1}};
        int[][] ans = rangeAddQueries(n,q);
        System.out.println(Arrays.deepToString(ans));
    }

}
