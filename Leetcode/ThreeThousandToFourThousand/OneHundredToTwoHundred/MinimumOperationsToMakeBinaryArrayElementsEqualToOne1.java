package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOne1 {

    public static int minOperations(int[] nums) {
        int n = nums.length, ans = 0;

        for (int i = 0; i <= n - 3; ++i) {
            if (nums[i] == 0) {
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ans++;
            }
        }

        for (int i = n - 2; i < n; ++i) {
            if (nums[i] == 0) {
                return -1;
            }
        }
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
        System.out.println(minOperations(nums));
    }
}
