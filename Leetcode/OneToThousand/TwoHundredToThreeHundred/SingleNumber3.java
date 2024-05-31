package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class SingleNumber3 {

    public static int[] singleNumber(int[] nums) {
        if(nums.length == 2)
            return nums;
        int xor = 0, a = 0;
        for(int x : nums)
            xor ^= x;
        int setBit = xor & -xor;
        for(int x : nums){
            if((x & setBit) != 0)
                a ^= x;
        }
        return new int[] {a, xor ^ a};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int[] ans = singleNumber(nums);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
