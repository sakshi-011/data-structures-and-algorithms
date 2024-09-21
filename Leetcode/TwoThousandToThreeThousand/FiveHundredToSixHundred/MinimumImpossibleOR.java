package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class MinimumImpossibleOR {

    public static int minImpossibleOR(int[] nums) {
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        for(i = 0; i <= 30; i++) {
            if (!set.contains((int)Math.pow(2,i)))
                return (int) Math.pow(2, i);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minImpossibleOR(nums));
    }
}
