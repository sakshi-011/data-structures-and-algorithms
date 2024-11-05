package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.Scanner;

public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {

    public static int minChanges(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(minChanges(s));
    }
}
