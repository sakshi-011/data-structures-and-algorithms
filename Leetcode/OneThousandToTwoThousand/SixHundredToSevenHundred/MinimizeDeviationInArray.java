package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimizeDeviationInArray {

    public static int minimumDeviation(int[] nums) {
        int min = Integer.MAX_VALUE, diff = Integer.MAX_VALUE, n = nums.length;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            if(num % 2 == 1)
                num *= 2;
            q.offer(num);
            min = Math.min(min,num);
        }
        while(true){
            int max = q.poll();
            diff = Math.min(diff,max-min);
            if(max % 2 == 1)
                break;
            max /= 2;
            min = Math.min(min,max);
            q.offer(max);
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minimumDeviation(nums));
    }
}
