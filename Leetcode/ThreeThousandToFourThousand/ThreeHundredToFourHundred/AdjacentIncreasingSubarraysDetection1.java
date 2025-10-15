package Leetcode.ThreeThousandToFourThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AdjacentIncreasingSubarraysDetection1 {

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int count = 1, prev = 0, maxLength = 0;
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) < nums.get(i+1))
                count++;
            else{
                prev = count;
                count = 1;
            }
            maxLength = Math.max(maxLength, Math.min(count,prev));
            maxLength = Math.max(maxLength, count/2);
        }
        return k <= maxLength;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < st.length; i++){
            nums.add(i,Integer.parseInt(st[i]));
        }
        System.out.println(hasIncreasingSubarrays(nums, k));
    }
}
