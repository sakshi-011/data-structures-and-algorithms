package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {

    public static int minimumOperations(int[] nums) {
        int ans = 0;
        for(int x : nums)
            if(x % 3 != 0)
                ans++;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minimumOperations(nums));
    }
}
