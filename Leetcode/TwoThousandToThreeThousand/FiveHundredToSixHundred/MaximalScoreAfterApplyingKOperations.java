package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximalScoreAfterApplyingKOperations {

    public static long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums)
            pq.add(num);
        for(int i = 0; i< k; i++){
            if(pq.isEmpty())
                break;
            double max = pq.poll();
            pq.add((int) Math.ceil(max / 3));
            ans += max;
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
        int k = in.nextInt();
        System.out.println(maxKelements(nums, k));
    }
}
