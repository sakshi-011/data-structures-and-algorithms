package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = a[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int k = in.nextInt();
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

}
