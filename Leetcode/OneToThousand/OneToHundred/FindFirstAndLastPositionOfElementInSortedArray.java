package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length, i =0, l = 0, r = n-1, mid, ans = -1;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid] == target){
                ans = mid;
                r = mid-1;
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        if(ans == -1)
            return new int[]{-1,-1};
        for (i = ans; i < n; i++) {
            if(nums[i] != target)
                break;
        }
        return new int[]{ans,i-1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int target = in.nextInt();
        int[] ans = searchRange(nums,target);
        System.out.println(ans[0]+","+ans[1]);
    }

}
