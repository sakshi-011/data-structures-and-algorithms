
package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),max=0;
        int[] nums = new int[n];
        
        for(int i=0;i<n;i++)
            nums[i] = in.nextInt();
        
        int max_so_far = nums[0];
        int curr_max = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
             curr_max = Math.max(nums[i], curr_max+nums[i]);
             max_so_far = Math.max(max_so_far, curr_max);
        }
        System.out.println(max_so_far);
    }
}
