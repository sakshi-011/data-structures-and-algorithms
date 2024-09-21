package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumTimeToCompleteTrips {

    public static long minimumTime(int[] time, int totalTrips) {
        long lo = 1, hi = 100000000000000L;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (!func(mid, totalTrips, time))
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

    private static boolean func(long x, int totalTrips, int[] time) {
        long sum = 0;
        for(int t: time)
            sum += x / t;
        return sum >= totalTrips;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] time = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            time[i] = Integer.valueOf(str[i]);
        }
        int total = in.nextInt();
        System.out.println(minimumTime(time,total));
    }

}
