package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class FindTheDivisibilityArrayOfAString {

    public static int[] divisibilityArray(String word, int m) {
        int n = word.length(), l;
        long num = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            l = word.charAt(i) - '0';
            num = (num * 10 + l) % m;
            if(num == 0)
                ans[i] = 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int m = in.nextInt();
        int[] ans = divisibilityArray(word,m);
        for(int a : ans)
            System.out.print(a+", ");
    }

}
