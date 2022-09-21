package Leetcode;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SumOfEvenNumbersAfterQueries {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries){
        int[] ans = new int[queries.length];
        Map<Integer,Boolean> m = new HashMap<>();
        int sum=0,temp,idx;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                m.put(i,true);
                sum+=nums[i];
            }
            else{
                m.put(i,false);
            }
        }
        for(int i=0;i< queries.length;i++){
            temp = queries[i][0];
            idx = queries[i][1];

            if(m.get(idx)){
                sum-=nums[idx];
                nums[idx]+=temp;
                if(temp % 2 == 0){
                    sum+=nums[idx];
                }
                else{
                    m.put(idx,false);
                }
            }
            else{
                nums[idx]+=temp;
                if(temp % 2 != 0){
                    sum+=nums[idx];
                    m.put(idx,true);
                }
            }
            ans[i]=sum;
            System.out.print(ans[i]+",");
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] ans1 = sumEvenAfterQueries(new int[]{1, 2, 3, 4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
        int[] ans2 = sumEvenAfterQueries(new int[]{-1,3,-3,9,-6,8,-5},new int[][]{{-5,1},{10,2},{-6,3},{3,2},{9,5},{7,5},{8,0}});
    }
}
