package Leetcode.TwoThousandToThreeThousand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceWithTheMinimumScore {

    public static int minimumScore(String s, String t) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(j<t.length() && s.charAt(i)==t.charAt(j))
                j++;
            list.add(j);
        }
        int ans = t.length() - j;
        j = t.length() - 1;
        for (int i = s.length()-1; i >= 0; i--) {
            ans = Math.min(ans,Math.max(0,j - list.get(i) + 1));
            if(j>=0 && s.charAt(i)==t.charAt(j))
                j--;
        }
        return Math.min(ans,j+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(minimumScore(s,t));
    }

}
