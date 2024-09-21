package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class CountWaysToGroupOverlappingRanges {

    public static int countWays(int[][] ranges) {
        int res = 1, last = -1, mod = (int)1e9 + 7;
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        for (int[] r: ranges) {
            if (last < r[0])
                res = res * 2 % mod;
            last = Math.max(last, r[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] ranges = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            ranges[i][0] = Integer.valueOf(st[0]);
            ranges[i][1] = Integer.valueOf(st[1]);
        }
        System.out.println(countWays(ranges));
    }

}
