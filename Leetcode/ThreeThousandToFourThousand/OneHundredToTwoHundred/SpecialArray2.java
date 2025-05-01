package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class SpecialArray2 {

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] maxReach = new int[n];
        int end = 0;

        for (int start = 0; start < n; start++) {
            end = Math.max(end, start);
            while (end < n - 1 && nums[end] % 2 != nums[end + 1] % 2) {
                end++;
            }
            maxReach[start] = end;
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int endQuery = queries[i][1];

            ans[i] = endQuery <= maxReach[start];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] queries = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            queries[i][0] = Integer.parseInt(t[0]);
            queries[i][1] = Integer.parseInt(t[1]);
        }
        boolean[] ans = isArraySpecial(nums, queries);
        for(boolean b : ans)
            System.out.print(b + " ");
    }
}
