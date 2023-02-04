package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Subsets {

    static List<List<Integer>> ans = new ArrayList<>();
    static int len;

    public static void subsetRecur(int[] nums, int first, ArrayList<Integer> curr){
        if(curr.size() == len){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = first; i < nums.length; i++) {
            curr.add(nums[i]);
            subsetRecur(nums, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0)
            return ans;
        for (len = 0; len < nums.length+1; len++) {
            subsetRecur(nums, 0, new ArrayList<>());
        }
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
        List<List<Integer>> ans = subsets(nums);
        for(List<Integer> l : ans)
            System.out.println(l.toString());
    }

}
