package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.HashSet;

public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i))
                return i;
            set.add(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int nums[] = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.valueOf(st[i]);
        }
        System.out.println(findDuplicate(nums));
    }

}
