package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.Scanner;

public class FindGreatestCommonDivisorOfArray {

    public static int findGCD(int[] nums) {

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, ans;

        for(int n : nums){
            max = Math.max(max,n);
            min = Math.min(min,n);
        }

        ans = gcd(max,min);
        return ans;
    }

    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(findGCD(nums));
    }
}
