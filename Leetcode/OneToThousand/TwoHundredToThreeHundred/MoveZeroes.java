package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class MoveZeroes {

    static int[] nums;

    public static void moveZeroes() {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            while(i+count < n && nums[i+count] == 0) {
                count++;
            }
            nums[i] = i+count<n ? nums[i+count] : 0;
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
        moveZeroes();
        for(int n : nums)
            System.out.print(n+" ");
    }

}
