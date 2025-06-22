package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DivideAStringIntoGroupsOfSizeK {

    public static String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        int curr = 0;
        while (curr < n) {
            int end = Math.min(curr + k, n);
            res.add(s.substring(curr, end));
            curr += k;
        }
        String last = res.get(res.size() - 1);
        if (last.length() < k) {
            last += String.valueOf(fill).repeat(k - last.length());
            res.set(res.size() - 1, last);
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        char x = in.next().charAt(0);
        String[] ans = divideString(s, k , x);
        for(String st : ans)
            System.out.print(st+" ");
    }
}
