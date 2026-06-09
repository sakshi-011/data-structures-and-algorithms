package Leetcode.TwoThousandToThreeThousand.TwoHundredToThreeHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindTheDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x : nums1)
            set1.add(x);
        for(int x : nums2)
            set2.add(x);
        list = new ArrayList<>();
        for(int x : set1){
            if(!set2.contains(x))
                list.add(x);
        }
        ans.add(list);
        list = new ArrayList<>();
        for(int x : set2){
            if(!set1.contains(x))
                list.add(x);
        }
        ans.add(list);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,4,3}, new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }
}
