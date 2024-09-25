package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;
import java.util.HashSet;

public class FindTheLengthOfTheLongestCommonPrefix {

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> arr1Prefixes = new HashSet<Integer>();

        for (int val : arr1) {
            while (!arr1Prefixes.contains(val) && val > 0) {
                arr1Prefixes.add(val);
                val /= 10;
            }
        }

        int longestPrefix = 0;
        for (int val : arr2) {
            while (!arr1Prefixes.contains(val) && val > 0) {
                val /= 10;
            }
            if (val > 0) {
                longestPrefix = Math.max(
                        longestPrefix,
                        (int) Math.log10(val) + 1
                );
            }
        }
        return longestPrefix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums1 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums1[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums2 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums2[i] = Integer.parseInt(st[i]);
        }
        System.out.println(longestCommonPrefix(nums1,nums2));
    }
}
