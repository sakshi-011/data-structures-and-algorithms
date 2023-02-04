package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Permutations {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void permuteRecur(ArrayList<Integer> curr, int[] nums, boolean[] visited){
        int n = nums.length;
        if(curr.size() == n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < n; i++) {
            if(visited[i])
                continue;
            curr.add(nums[i]);
            visited[i] = true;
            permuteRecur(curr,nums,visited);
            visited[i] = false;
            curr.remove(curr.size()-1);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0)
            return ans;
        permuteRecur(new ArrayList<Integer>(), nums, new boolean[nums.length]);
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
        List<List<Integer>> ans = permute(nums);
        for(List<Integer> l : ans)
            System.out.println(l);
    }

}
