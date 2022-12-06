package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int l=0, n=nums.length, r=n-1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if(Math.abs(nums[l])>Math.abs(nums[r])) {
                res[n - i - 1] =nums[l]*nums[l];
                l++;
            }else{
                res[n - i - 1] =nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int[] res = sortedSquares(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

}
