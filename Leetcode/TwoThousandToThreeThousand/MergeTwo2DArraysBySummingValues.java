package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwo2DArraysBySummingValues {

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int[] arr : nums1) {
            map.put(arr[0],arr[1]);
        }
        for(int[] arr : nums2){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }
        int[][] ans = new int[map.size()][2];
        int idx = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
            ans[idx++] = new int[]{e.getKey(),e.getValue()};
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] nums1 = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            if(st.length == 0)
                break;
            nums1[i][0] = Integer.valueOf(st[0]);
            nums1[i][1] = Integer.valueOf(st[1]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").split("],");
        int[][] nums2 = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            if(st.length == 0)
                break;
            nums2[i][0] = Integer.valueOf(st[0]);
            nums2[i][1] = Integer.valueOf(st[1]);
        }
        int[][] ans = mergeArrays(nums1,nums2);
        for(int[] arr : ans){
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
