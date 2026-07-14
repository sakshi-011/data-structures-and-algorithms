package Leetcode.OneThousandToTwoThousand.TwoHundredToThreeHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialDigits {

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String s = "123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);

        for (int len = l.length(); len <= h.length(); len++) {
            for (int start = 0; start <= 9 - len; start++) {
                int num = Integer.parseInt(s.substring(start, start + len));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        List<Integer> ans = sequentialDigits(low,high);
        for(int n : ans)
            System.out.println(n);
    }
}
