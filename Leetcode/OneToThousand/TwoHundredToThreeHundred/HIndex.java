package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class HIndex {

    public static int hIndex(int[] citations) {
        int n = citations.length, count = 0;
        int[] buckets = new int[n+1];
        for(int x : citations){
            if(x > n)
                buckets[n]++;
            else
                buckets[x]++;
        }
        for(int i = n; i >= 0; i--){
            count += buckets[i];
            if(count >= i)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(hIndex(nums));
    }
}
