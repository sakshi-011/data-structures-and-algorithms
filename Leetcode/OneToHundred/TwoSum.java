package Leetcode.OneToHundred;

import java.util.Scanner;
import java.util.HashMap;

public class TwoSum{
    
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            if(h.containsKey(target-nums[i]))
            {
                ans[1] = i;
                ans[0] = h.get(target-nums[i]);
                return ans;
            }
            h.put(nums[i],i);
        }
        return ans;
    }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = in.nextInt();
        int target = in.nextInt();
        int[] ans = twoSum(nums,target);
        System.out.println(ans[0]+","+ans[1]);
    }
}
