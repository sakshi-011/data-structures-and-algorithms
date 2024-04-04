package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;
import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValue2 {

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int num : nums) {
            pq.add(num);
        }

        while (pq.size() >= 2 && pq.peek() < k) {
            int x = pq.peek();
            pq.poll();
            int y = pq.peek();
            pq.poll();

            int sum = Math.min(x, y) * 2 + Math.max(x, y);
            pq.add(sum);
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++)
            nums[i] = Integer.valueOf(st[i]);
        int k = in.nextInt();
        System.out.println(minOperations(nums,k));
    }
}
