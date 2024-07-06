package Leetcode.ThreeThousandToFourThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class AlternatingGroups1 {

    public static int numberOfAlternatingGroups(int[] colors) {
        int first = colors[0], second = colors[1], n = colors.length, count = 0;
        for(int i = 0; i < n-2; i++){
            if(colors[i] == colors[i+2] && colors[i] != colors[i+1])
                count++;
        }
        if(colors[n-2] == first && colors[n-2] != colors[n-1])
            count++;
        if(colors[n-1] == second && colors[n-1] != first)
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
        System.out.println(numberOfAlternatingGroups(nums));
    }
}
