package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;

public class FindTheMaximumSumOfNodeValues {

    public static long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int min = Integer.MAX_VALUE, count = 0, x, y;
        for(int n : nums){
            x = n;
            y = n ^ k;
            if(x > y) {
                sum += x;
            } else {
                sum += y;
                count++;
            }
            min = Math.min(min,Math.abs(x-y));
        }
        if(count % 2 == 1)
            sum -= min;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.valueOf(st[i]);
        }
        int k = in.nextInt();
        s = in.next();
        st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] edges = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            edges[i][0] = Integer.valueOf(t[0]);
            edges[i][1] = Integer.valueOf(t[1]);
        }
        System.out.println(maximumValueSum(nums,k,edges));
    }
}
