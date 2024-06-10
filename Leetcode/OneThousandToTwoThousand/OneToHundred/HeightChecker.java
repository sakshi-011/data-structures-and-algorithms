package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;
import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int count = 0;
        for(int i = 0; i < heights.length; i++)
            if(heights[i] != sorted[i])
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(heightChecker(nums));
    }
}
