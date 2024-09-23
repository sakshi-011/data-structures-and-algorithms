package Leetcode.TwoThousandToThreeThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ExtraCharactersInAString {
    static Integer[] memo;
    static Set<String> dictionarySet;

    public static int minExtraChar(String s, String[] dictionary) {
        dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        memo = new Integer[n];
        return dp(0, n, s);
    }

    public static int dp(int start, int n, String s){
        if(start == n)
            return 0;
        if(memo[start] != null)
            return memo[start];
        int ans = dp(start+1, n, s) + 1;
        for (int end = start; end < n; end++) {
            String curr = s.substring(start, end + 1);
            if (dictionarySet.contains(curr)) {
                ans = Math.min(ans, dp(end + 1, n, s));
            }
        }
        return memo[start] = ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.next();
        String[] dictionary = t.replaceAll("\\[\"","").replaceAll("]\"","").split("\",\"");
        System.out.println(minExtraChar(s,dictionary));
    }
}
