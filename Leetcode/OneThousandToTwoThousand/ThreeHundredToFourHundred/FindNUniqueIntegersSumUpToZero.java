package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class FindNUniqueIntegersSumUpToZero {

    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n == 1)
            return ans;
        for (int i = 0; i < n / 2; i++) {
            ans[i] = i + 1;
            ans[n - i - 1] = -1 * (ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ans = sumZero(n);
        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}
