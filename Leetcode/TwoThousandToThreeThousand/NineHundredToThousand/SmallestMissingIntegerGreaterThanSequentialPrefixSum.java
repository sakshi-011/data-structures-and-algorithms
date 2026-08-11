package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {

    public static int missingInteger(int[] nums) {

        int prefixLen = 1, n = nums.length;
        if(n == 1)
            return nums[0]+1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                prefixLen += 1;
            } else {
                break;
            }
        }

        int maxSum = ((nums[prefixLen - 1] + nums[0]) * prefixLen) / 2;
        while(set.contains(maxSum)){
            maxSum++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(missingInteger(nums));
    }
}
