package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class LongestSquareStreakInAnArray {

    public static int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for (int number : nums) {
            int root = (int) Math.sqrt(number);
            if (root * root == number && map.containsKey(root)) {
                map.put(number, map.get(root) + 1);
            } else {
                map.put(number, 1);
            }
        }
        int max = 0;
        for (int streakLength : map.values()) {
            max = Math.max(max, streakLength);
        }
        return max == 1 ? -1 : max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(longestSquareStreak(nums));
    }

}
