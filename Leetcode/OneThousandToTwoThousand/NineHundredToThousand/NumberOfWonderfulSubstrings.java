package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfWonderfulSubstrings {

    public static long wonderfulSubstrings(String word) {
        int N = word.length();

        Map<Integer, Integer> freq = new HashMap<>();

        freq.put(0, 1);

        int mask = 0;
        long res = 0L;
        for (int i = 0; i < N; i++) {
            char c = word.charAt(i);
            int bit = c - 'a';

            mask ^= (1 << bit);

            res += freq.getOrDefault(mask, 0);

            freq.put(mask, freq.getOrDefault(mask, 0) + 1);

            for (int odd_c=0; odd_c < 10; odd_c++) {
                res += freq.getOrDefault(mask ^ (1 << odd_c),0);
            }
        }
        return res;
    }

    /*Exceeds time limit
    public static long wonderfulSubstrings0(String word) {
        int n = word.length();
        long ans = n;
        for(int i = 2; i <= n; i++){
            int left = 0, right = i-1;
            long[] count = new long[10];
            for(int j = left; j <= right; j++){
                count[word.charAt(j) - 'a']++;
            }
            while(right < n){
                int odd = 0;
                for(int k = 0; k < 10; k++){
                    if(count[k] % 2 != 0)
                        odd++;
                }
                if(odd <= 1)
                    ans++;
                count[word.charAt(left) - 'a']--;
                left++;
                right++;
                if(right >= n)
                    continue;
                count[word.charAt(right) - 'a']++;
            }
        }
        return ans;
    }
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(wonderfulSubstrings(word));
    }
}
