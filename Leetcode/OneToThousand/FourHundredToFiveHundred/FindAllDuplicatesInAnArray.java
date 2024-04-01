package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class FindAllDuplicatesInAnArray {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length <= 1)
            return ans;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i))
                ans.add(i);
            set.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replace("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.valueOf(st[i]);
        }
        List<Integer> ans = findDuplicates(nums);
        for(Integer i : ans)
            System.out.print(i+" ");
    }
}
