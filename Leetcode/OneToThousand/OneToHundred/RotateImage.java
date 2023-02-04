package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class RotateImage {

    static int[][] matrix;

    public static void transpose(int[][] matrix){
        int n = matrix.length, temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reflect(int[][] matrix){
        int n = matrix.length, temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        matrix = new int[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            for (int j = 0; j < str.length; j++) {
                matrix[i][j] = Integer.valueOf(st[j]);
            }
        }
        rotate(matrix);
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
