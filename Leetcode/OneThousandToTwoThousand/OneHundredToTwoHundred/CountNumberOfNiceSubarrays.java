package Leetcode.OneThousandToTwoThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class CountNumberOfNiceSubarrays {

    public static int numberOfSubarrays(int[] nums, int k) {
        Queue<Integer> oddIndices = new LinkedList<>();
        int ans = 0, lastPopped = -1, initialGap = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                oddIndices.offer(i);
            }
            if (oddIndices.size() > k) {
                lastPopped = oddIndices.poll();
            }
            if (oddIndices.size() == k) {
                initialGap = oddIndices.element() - lastPopped;
                ans += initialGap;
            }
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
        System.out.println(numberOfSubarrays(nums,k));
    }
}
