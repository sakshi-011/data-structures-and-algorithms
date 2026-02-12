package Leetcode.ThreeThousandToFourThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Arrays;

public class LongestBalancedSubstring1 {

    public static int longestBalanced(String s) {
        int[] count = new int[26];
        int n = s.length(), len = 0;
        for(int i = 0; i < n; i++){
            Arrays.fill(count, 0);
            for (int j = i; j < n; j++) {
                boolean flag = true;
                int c = s.charAt(j) - 'a';
                count[c]++;
                for (int x : count) {
                    if (x > 0 && x != count[c]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(longestBalanced(s));
    }
}
