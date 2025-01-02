package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class CountVowelStringsInRanges {

    public static int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u')
        );
        int n = words.length, j = 0, currSum = 0;
        int[] prefixSum = new int[n];
        int[] sum = new int[queries.length];
        for(int i = 0; i < n; i++){
            String word = words[i];
            if(vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))){
                currSum++;
            }
            prefixSum[i] = currSum;
        }
        for(int[] q : queries){
            sum[j++] = prefixSum[q[1]] - (q[0] == 0 ? 0 : prefixSum[q[0] - 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] queries = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            queries[i][0] = Integer.parseInt(t[0]);
            queries[i][1] = Integer.parseInt(t[1]);
        }
        int[] ans = vowelStrings(words, queries);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
