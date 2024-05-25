package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTheXOROfNumbersWhichAppearTwice {

    public static int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if (set.contains(n)){
                ans ^= n;
            }
            set.add(n);
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
        System.out.println(duplicateNumbersXOR(nums));
    }
}
