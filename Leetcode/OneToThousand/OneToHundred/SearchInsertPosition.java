package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0,idx=-1;
        if(target<nums[0]) return 0;
        if(target>nums[r]) return r+1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
                idx = mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return  idx + 1;
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
        System.out.println(searchInsert(nums,target));
    }
}
