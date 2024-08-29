package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;
import java.util.Arrays;

public class BestTeamWithNoConflicts {

    public static int findMaxScore(Integer[][] dp, int[][] pair, int prev, int index){
        if(index >= pair.length)
            return 0;
        if(dp[prev+1][index] != null)
            return dp[prev+1][index];
        if(prev == -1 || pair[index][1] >= pair[prev][1]){
            return dp[prev+1][index] = Math.max(findMaxScore(dp,pair,prev,index+1),pair[index][1]+findMaxScore(dp,pair,index,index+1));
        }
        return dp[prev+1][index] = findMaxScore(dp,pair,prev,index+1);
    }

    public static int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = ages[i];
            pair[i][1] = scores[i];
        }
        Arrays.sort(pair, (a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0] );

        Integer[][] dp = new Integer[n][n];

        return findMaxScore(dp, pair,-1,0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] scores = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            scores[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] ages = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            ages[i] = Integer.valueOf(str[i]);
        }
        System.out.println(bestTeamScore(scores,ages));
    }

}
