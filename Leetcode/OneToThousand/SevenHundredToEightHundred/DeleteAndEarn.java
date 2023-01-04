package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DeleteAndEarn {

    public static int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int del = 0, notDel = 0, curr = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i=min;i<=max;i++) {
            curr = notDel + i * mp.getOrDefault(i,0);
            notDel = Math.max(notDel, del);
            del = curr;
        }
        return Math.max(del, notDel);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(deleteAndEarn(nums));
    }

}
