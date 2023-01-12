package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int count = 0, ans = 0, diff = nums[1]-nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1] == diff){
                count++;
            }else{
                count++;
                if(count>=3){
                    ans += (count*(count+1))/2 - (2*count - 1);
                }
                count = 1;
                diff = nums[i] - nums[i-1];
            }
        }
        count++;
        if(count>=3){
            ans += (count*(count+1))/2 - (2*count - 1);
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
        System.out.println(numberOfArithmeticSlices(nums));
    }

}
