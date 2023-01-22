package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    /*
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int count = 0, i;
        for (i = 0; i < nums.length-1; i++) {
            count++;
            if(count == 1 && nums[i]!=nums[i+1]){
                break;
            }
            else if(count == 2){
                count = 0;
            }
        }
        return nums[i];
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
        System.out.println(singleNumber(nums));
    }
}
