package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        int[] ans = new int[set1.size()];
        int p = 0;
        for (Integer i : set1) {
            ans[p++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums1 = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums1[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums2 = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums2[i] = Integer.valueOf(str[i]);
        }
        int[] ans = intersection(nums1,nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+",");
        }
    }

}
