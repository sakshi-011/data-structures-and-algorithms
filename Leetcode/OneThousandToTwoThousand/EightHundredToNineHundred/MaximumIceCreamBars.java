package Leetcode.OneThousandToTwoThousand.EightHundredToNineHundred;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumIceCreamBars {

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int res = 0;
        while (res < n && costs[res] <= coins) {
            coins -= costs[res];
            res += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int coins = in.nextInt();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] costs = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            costs[i] = Integer.valueOf(str[i]);
        }
        System.out.println(maxIceCream(costs,coins));
    }

}
