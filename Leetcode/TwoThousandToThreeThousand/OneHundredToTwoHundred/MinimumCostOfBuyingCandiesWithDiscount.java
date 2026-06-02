package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length, sum = cost[n-1], count = 1;
        for(int i = n-2; i >= 0; i--){
            if(count == 2){
                count = 0;
            } else {
                sum += cost[i];
            }
            count++;
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
        System.out.println(minimumCost(nums));
    }
}
