package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Arrays;

public class TypeOfTriangle {

    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        } else if (nums[0] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        System.out.println(triangleType(new int[]{3,3,3}));
        System.out.println(triangleType(new int[]{3,4,5}));
    }
}
