package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ConcatenatedWords {

    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        final Set<String> dict = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            int n = word.length();
            boolean[] dp = new boolean[n+1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = (i == n ? 1 : 0); !dp[i] && j < i; j++) {
                    dp[i] = dp[j] && dict.contains(word.substring(j,i));
                }
            }
            if(dp[n])
                ans.add(word);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            s = in.next();
            words[i] = s;
        }
        System.out.println(findAllConcatenatedWordsInADict(words).toString());
    }

}
