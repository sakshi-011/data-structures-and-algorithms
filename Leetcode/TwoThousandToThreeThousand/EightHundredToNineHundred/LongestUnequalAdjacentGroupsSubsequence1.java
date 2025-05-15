package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LongestUnequalAdjacentGroupsSubsequence1 {

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (i == 0 || groups[i] != groups[i - 1]) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] words = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        List<String> ans = getLongestSubsequence(words, nums);
        for(String t : ans)
            System.out.print(t+" ");
    }
}
