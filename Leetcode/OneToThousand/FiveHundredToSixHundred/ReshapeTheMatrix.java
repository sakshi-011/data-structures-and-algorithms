package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class ReshapeTheMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat[0].length;
        if (r * c != mat.length * n) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }

    /*
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c)
            return mat;
        int list[] = new int[r*c];
        int res[][] = new int[r][c];
        int idx=0,i,j;
        for(i=0;i<mat.length;i++){
            for(j=0;j<mat[0].length;j++){
                list[idx++] = mat[i][j];
            }
        }
        idx=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                res[i][j] = list[idx++];
            }
        }

        return res;
    }
    */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }
        int r = in.nextInt();
        int c = in.nextInt();
        int ans[][] = matrixReshape(mat,r,c);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}
