package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > h)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] piles = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            piles[i] = Integer.valueOf(str[i]);
        }
        int h = in.nextInt();
        System.out.println(minEatingSpeed(piles,h));
    }

}
