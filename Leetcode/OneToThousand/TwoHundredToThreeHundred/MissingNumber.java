package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, left = 1, right = n-1, mid, ans;
        if(nums[0] != 0)
            return 0;
        while(left <= right){
            mid = (left + right) / 2;
            if((nums[mid-1] == mid-1) && nums[mid]-1 == mid)
                return mid;
            if(nums[mid] == mid){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return nums[n-1]+1;
    }

    /* XOR
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(missingNumber(nums));
    }

}
