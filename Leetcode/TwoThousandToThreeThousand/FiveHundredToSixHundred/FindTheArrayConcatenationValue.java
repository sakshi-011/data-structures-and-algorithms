package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class FindTheArrayConcatenationValue {

    public static long findTheArrayConcVal(int[] nums) {
        if(nums.length == 0)
            return 0;
        String s;
        int n = nums.length;
        long temp, ans = 0;
        for(int i = 0; i< n/2; i++){
            s =  ""+nums[i]+nums[n-i-1];
            temp = Integer.parseInt(s);
            ans += temp;
        }
        if(n % 2 == 1){
            ans += nums[n/2];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(findTheArrayConcVal(nums));
    }

}
