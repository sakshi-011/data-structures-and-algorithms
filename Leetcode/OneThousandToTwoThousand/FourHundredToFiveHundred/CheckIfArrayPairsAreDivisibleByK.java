package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CheckIfArrayPairsAreDivisibleByK {

    public static boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();

        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            if (rem == 0) {
                if (remainderCount.get(rem) % 2 == 1)
                    return false;
            } else if ((int) remainderCount.getOrDefault(rem,0) != (int) remainderCount.getOrDefault(k - rem,0))
                    return false;
        }
        return true;
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
        System.out.println(canArrange(nums,k));
    }
}
