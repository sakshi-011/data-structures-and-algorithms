package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, left = 0, right = n-1, count = 0;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum < k){
                left++;
            } else if(sum > k){
                right--;
            }else{
                count++;
                left++;
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4},5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
}
