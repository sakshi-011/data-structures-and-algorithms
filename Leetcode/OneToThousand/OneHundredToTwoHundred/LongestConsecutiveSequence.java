package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet();
        for (int n : nums) {
            set.add(n);
        }
        int ans = 0, curr, count = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                count = 1;
                curr = n;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                ans = Math.max(ans,count);
            }
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
        System.out.println(longestConsecutive(nums));
    }
}
