package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock2 {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] prices = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            prices[i] = Integer.valueOf(str[i]);
        }
        System.out.println(maxProfit(prices));
    }

}
