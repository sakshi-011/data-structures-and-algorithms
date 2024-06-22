package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FindTheMaximumLengthOfAGoodSubsequence1 {

    public static int maximumLength(int[] nums, int k) {
        int n = nums.length, ans = 1;
        int[][] dp = new int[n][k+1];
        for(int i = 0; i < n; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= k; j++){
                dp[i][j] = 1;
                for(int l = 0; l < i; l++){
                    if(nums[l] == nums[i])
                        dp[i][j] = Math.max(dp[i][j],dp[l][j]+1);
                    else if(j > 0)
                        dp[i][j] = Math.max(dp[i][j],dp[l][j-1]+1);
                }
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int k = in.nextInt();
        System.out.println(maximumLength(nums,k));
    }
}
