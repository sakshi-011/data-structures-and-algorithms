package Leetcode.ThreeThousandToFourThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class TransformedArray {

    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0)
                result[i] = nums[i];
            else {
                result[i] = nums[(((i + nums[i]) % n) + n) % n];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int[] ans = constructTransformedArray(nums);
        for (int i : ans) {
            System.out.print(i+",");
        }
    }
}
