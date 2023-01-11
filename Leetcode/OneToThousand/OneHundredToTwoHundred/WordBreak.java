package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && dict.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\"", "").split(",");
        List<String> wordDict = new ArrayList<>();
        for (String x: str) {
            wordDict.add(x);
        }
        System.out.println(wordBreak(t,wordDict));
    }

}
