package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            if(i >= k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
