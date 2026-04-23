package Leetcode.TwoThousandToThreeThousand.SixHundredToSevenHundred;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfDistances {

    /* O(n2)
    public static long[] distance(int[] nums) {
        int n = nums.length;
        long[] sum = new long[n];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]){
                    sum[i] += Math.abs(i-j);
                    sum[j] += Math.abs(i-j);
                }
            }
        }
        return sum;
    }
    */

    public static long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            groups.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        long[] res = new long[n];
        for (List<Integer> group : groups.values()) {
            long total = 0;
            for (int idx : group) {
                total += idx;
            }
            long prefixTotal = 0;
            int sz = group.size();
            for (int i = 0; i < sz; i++) {
                int idx = group.get(i);
                res[idx] = total - prefixTotal * 2 + (long) idx * (2 * i - sz);
                prefixTotal += idx;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        long[] result = distance(new int[]{1,3,1,1,2});
        for(long l : result)
            System.out.print(l+" ");
    }
}
