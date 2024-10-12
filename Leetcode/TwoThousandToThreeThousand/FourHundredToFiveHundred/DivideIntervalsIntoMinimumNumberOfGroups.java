package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class DivideIntervalsIntoMinimumNumberOfGroups {

    public static int minGroups(int[][] intervals) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int[] range : intervals){
            min = Math.min(min, range[0]);
            max = Math.max(max, range[1]);
        }
        int[] count = new int[max + 2];
        for(int[] range : intervals){
            count[range[0]]++;
            count[range[1] + 1]--;
        }

        int ans = 0, curr = 0;
        for(int i = min; i <= max; i++){
            curr += count[i];
            ans = Math.max(ans,curr);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] nums = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            nums[i][0] = Integer.parseInt(t[0]);
            nums[i][1] = Integer.parseInt(t[1]);
        }
        System.out.println(minGroups(nums));
    }
}
