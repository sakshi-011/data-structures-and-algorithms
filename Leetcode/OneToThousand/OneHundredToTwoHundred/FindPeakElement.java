package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1, mid;
        while(low < high){
            mid = (low + high) / 2;
            if(nums[mid] > nums[mid+1])
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(findPeakElement(nums));
    }

}
