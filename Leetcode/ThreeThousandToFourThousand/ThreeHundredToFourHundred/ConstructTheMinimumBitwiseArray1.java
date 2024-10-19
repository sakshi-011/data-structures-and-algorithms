package Leetcode.ThreeThousandToFourThousand.ThreeHundredToFourHundred;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ConstructTheMinimumBitwiseArray1 {

    public static int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int x = nums.get(i);
            if(x == 2) {
                ans[i] = -1;
            } else {
                ans[i] = x - ((x + 1) & (-x - 1)) / 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        List<Integer> nums = new ArrayList<>();
        for (String value : st) {
            nums.add(Integer.parseInt(value));
        }
        int[] ans = minBitwiseArray(nums);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
