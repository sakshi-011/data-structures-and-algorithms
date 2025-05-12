package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int n = nums.length, low = 0, high = n-1, mid = 0;
        if(n == 1)
            return nums[0];
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] < nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(findMin(nums));
    }
}
