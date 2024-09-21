package Leetcode.TwoThousandToThreeThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
public class MinimumAverageDifference {

    public static int minAvgDiff(int[] nums){
        int ans=0,div;
        if(nums.length==1) return ans;

        long[] sum = new long[nums.length];
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=nums[i]+sum[i-1];
        }
        long total=sum[sum.length-1], min=Integer.MAX_VALUE, cur=0;
        for(int i=0;i<nums.length;i++){
            div = (nums.length-i-1)==0 ? 1 : nums.length-i-1;
            cur = Math.abs((int)Math.floor(sum[i]/(i+1)) - (int)Math.floor(((total-sum[i])/(div))));
            if(cur<min){
                min=cur;
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minAvgDiff(nums));
    }

}
