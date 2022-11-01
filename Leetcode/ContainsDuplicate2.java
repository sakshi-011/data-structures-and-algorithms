package Leetcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();

        String[] ar = s.split(",");
        int[] nums = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            nums[i] = Integer.parseInt(ar[i]);
        }

        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
