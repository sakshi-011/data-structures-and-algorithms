package Leetcode.TwoThousandToThreeThousand.SixHundredToSevenHundred;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            list.add(new ArrayList<>());
        for(int n : nums){
            for(List<Integer> s : list){
                if(!s.contains(n)) {
                    s.add(n);
                    break;
                }
            }
        }
        for(List<Integer> s : list){
            if(s.size() > 0)
                ans.add(s);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        List<List<Integer>> ans = findMatrix(nums);
        for(List<Integer> l : ans) {
            for(Integer x : l)
                System.out.print(x+", ");
            System.out.println();
        }
    }
}
