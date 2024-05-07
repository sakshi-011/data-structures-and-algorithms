package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if(nums.length == 1) {
            ranges.add(nums[0]+"");
            return ranges;
        }

        for(int i = 0; i < nums.length; i++){
            int start = nums[i];
            while(i+1 < nums.length && nums[i+1] == nums[i]+1){
                i++;
            }
            if(start == nums[i])
                ranges.add(start+"");
            else
                ranges.add(start+"->"+nums[i]);
        }
        return ranges;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        List<String> ans = summaryRanges(nums);
        for(String range : ans){
            System.out.println(range);
        }
    }
}
