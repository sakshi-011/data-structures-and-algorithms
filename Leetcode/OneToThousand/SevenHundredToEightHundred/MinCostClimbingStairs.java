package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int l = 0, sl = cost[cost.length-1],curr;
        for (int i = cost.length-2; i >= 0 ; i--) {
            curr = Math.min(l+cost[i],sl+cost[i]);
            l = sl;
            sl = curr;
        }
        return Math.min(l,sl);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] cost = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            cost[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minCostClimbingStairs(cost));
    }

}
