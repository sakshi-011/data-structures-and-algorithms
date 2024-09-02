package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import java.util.Scanner;

public class Convert1DArrayInto2DArray {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        for(int i = 0; i < original.length; i++){
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] result = construct2DArray(nums,m,n);
        for(int[] arr : result) {
            for (int x : arr)
                System.out.print(x + ",");
            System.out.println();
        }
    }
}
