package Leetcode.ThreeThousandToFourThousand.NineHundredToThousand;

import java.util.Scanner;

public class SumOfIntegersWithMaximumDigitRange {

    public static int maxDigitRange(int[] nums) {
        int n = nums.length, max = Integer.MIN_VALUE, sum = 0, l = 0, s = 0, d = 0, x = 0;
        int[] digitRange = new int[n];
        for(int i = 0; i < n; i++){
            l = 0;
            s = 99;
            x = nums[i];
            while(x > 0){
                d = x % 10;
                x = x / 10;
                l = Math.max(l,d);
                s = Math.min(s,d);
            }
            digitRange[i] = l-s;
            max = Math.max(digitRange[i], max);
        }
        for(int i = 0; i < n; i++){
            if(digitRange[i] == max)
                sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(maxDigitRange(nums));
    }
}
