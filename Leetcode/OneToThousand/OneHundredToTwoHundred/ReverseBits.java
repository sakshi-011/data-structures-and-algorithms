package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class ReverseBits {

    public static int reverseBits(int n) {
        if (n == 0)
            return 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            if ((n & 1) == 1)
                ans++;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverseBits(n));
    }

}
