package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Arrays;

public class FindTheMaximumNumberOfMarkedIndices {

    public static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, n = nums.length;
        for (int i = n/2-1, j = n-1; i >= 0; i--) {
            if(nums[i] * 2 <= nums[j]){
                ans += 2;
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(maxNumOfMarkedIndices(nums));
    }

}
