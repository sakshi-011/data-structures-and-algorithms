package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class LengthOfLongestSubarrayWithAtMostKFrequency {

    public static int maxSubarrayLength(int[] nums, int k) {
        int start = -1, n = nums.length, count = 0, max = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            count = map.getOrDefault(nums[i],0) + 1;
            map.put(nums[i],count);

            while(map.get(nums[i]) > k){
                start++;
                map.put(nums[start], map.get(nums[start]) - 1);
            }

            max = Math.max(i - start,max);
        }

        return max;
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
        System.out.println(maxSubarrayLength(nums, k));
    }
}
