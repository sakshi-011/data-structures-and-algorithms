package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public static int specialArray(int[] nums) {
        int ans = -1, n = nums.length, sum = 0;
        int[] count = new int[n+1];
        for(int i = 0; i < n; i++){
            if(nums[i] >= n)
                count[n]++;
            else
                count[nums[i]]++;
        }
        for(int i = n; i > 0; i--){
            sum += count[i];
            if(sum == i)
                ans = i;
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
        System.out.println(specialArray(nums));
    }
}
