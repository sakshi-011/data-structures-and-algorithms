package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class CountingBits {

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <= n; i++){
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ans = countBits(n);
        for(int x : ans)
            System.out.print(x+",");
    }
}
