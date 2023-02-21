package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class SingleElementInASortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length, l = 0, r = n-1, mid = 0;
        if(n == 1)
            return nums[0];
        while(l < r){
            mid = ( l + r ) / 2;
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(singleNonDuplicate(nums));
    }

}
