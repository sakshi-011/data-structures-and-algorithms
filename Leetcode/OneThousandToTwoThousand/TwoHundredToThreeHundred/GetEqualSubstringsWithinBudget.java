package Leetcode.OneThousandToTwoThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class GetEqualSubstringsWithinBudget {

    public static int equalSubstring(String s, String t, int maxCost) {
        int ans = 0, n = s.length();
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            diff[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }
        int curr = diff[0], max = 0, left = 0;
        for(int i = 1; i < n; i++){
            if(curr <= maxCost) {
                max = Math.max(curr, max);
                ans = Math.max(i-left,ans);
            }
            while(curr + diff[i] > maxCost && left < i) {
                curr -= diff[left];
                left++;
            }
            curr += diff[i];
        }
        if(curr <= maxCost)
            ans = Math.max(n-left,ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int cost = in.nextInt();
        System.out.println(equalSubstring(s,t,cost));
    }
}
