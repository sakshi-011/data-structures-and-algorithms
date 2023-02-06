package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class SortColors {

    static int[] nums;

    public static void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1, temp;
        while(mid <= right){
            if(nums[mid] == 0){
                nums[mid] = nums[left];
                nums[left] = 0;
                left++;
            }else if(nums[mid] == 2){
                nums[mid] = nums[right];
                nums[right] = 2;
                right--;
                mid--;
            }
            mid++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        sortColors(nums);
        for(int i : nums)
            System.out.print(i+" ");
    }

}
