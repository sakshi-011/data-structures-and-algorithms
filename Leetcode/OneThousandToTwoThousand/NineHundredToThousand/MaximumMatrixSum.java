package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.Scanner;

public class MaximumMatrixSum {

    public static long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                totalSum += Math.abs(val);
                if (val < 0) {
                    negativeCount++;
                }
                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }
        if (negativeCount % 2 != 0) {
            totalSum -= 2 * minAbsVal;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int n = st.length;
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] nums = st[i].replaceAll("\\[","").replaceAll("]","").split(",");
            for(int j = 0; j < n; j++)
                matrix[i][j] = Integer.parseInt(nums[j]);
        }
        System.out.println(maxMatrixSum(matrix));
    }
}
