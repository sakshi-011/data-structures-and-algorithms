package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class MinimumTimeToMakeRopeColorful {

    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int result = 0;
        int prevCost = neededTime[0];

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i-1)) {
                result += Math.min(neededTime[i], prevCost);
                prevCost = Math.max(neededTime[i], prevCost);
            } else
                prevCost = neededTime[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String colors = in.next();
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] time = new int[st.length];
        for(int i = 0; i < st.length; i++){
            time[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minCost(colors, time));
    }
}
