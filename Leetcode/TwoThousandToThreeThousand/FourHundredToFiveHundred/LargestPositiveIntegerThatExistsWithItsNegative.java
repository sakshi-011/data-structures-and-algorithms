package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class LargestPositiveIntegerThatExistsWithItsNegative {

    public static int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for(int n : nums){
            if(n<0)
                set.add(Math.abs(n));
        }
        for(int n : nums){
            if(n > max && set.contains(n))
                max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.valueOf(st[i]);
        }
        System.out.println(findMaxK(nums));
    }
}
