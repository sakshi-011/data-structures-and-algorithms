package Leetcode.TwoThousandToThreeThousand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberOfGoodSubarrays {

    public static long countGood(int[] nums, int k) {
        long ans = 0L;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < nums.length; ++j) {
            int x = map.getOrDefault(nums[j],0);
            k -= x;
            map.put(nums[j],x+1);
            while(k <= 0){
                map.put(nums[i],map.get(nums[i])-1);
                k += map.get(nums[i++]);
            }
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int k = in.nextInt();
        System.out.println(countGood(nums,k));
    }

}
