package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeSumDivisibleByP {

    public static int minSubarray(int[] nums, int p) {
        int n = nums.length, sum = 0;
        for(int i = 0; i < n; i++){
            sum = (nums[i] + sum) % p;
        }
        int excess = sum % p;
        if(excess == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currentSum = 0, ans = n;
        for(int i = 0; i < n; i++){
            currentSum = (currentSum + nums[i]) % p;
            int required = (currentSum - excess + p) % p;

            if(map.containsKey(required)){
                ans = Math.min(ans, i - map.get(required));
            }
            map.put(currentSum,i);
        }
        return ans == n ? -1 : ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int p = in.nextInt();
        System.out.println(minSubarray(nums,p));
    }
}
