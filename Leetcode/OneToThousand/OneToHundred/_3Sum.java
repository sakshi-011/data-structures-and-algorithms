package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer,Integer> map;
        int i,j,n = nums.length;
        for (i = 0; i < n-2; i++) {
            map = new HashMap<>();
            for (j = i+1; j < n; j++) {
                if(map.containsKey(0-nums[i]-nums[j])){
                    set.add(Arrays.asList(nums[i],nums[j],0-nums[i]-nums[j]));
                }
                map.put(nums[j],j);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }

        List<List<Integer>> l = threeSum(nums);
        for (List<Integer> list : l) {
            System.out.println(list.toString());
        }
    }

}
