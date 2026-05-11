package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SeparateTheDigitsInAnArray {

    public static int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            int n = nums[i];
            while(n > 0){
                l.add(n % 10);
                n = n/10;
            }
        }
        Collections.reverse(l);
        int s = l.size();
        int[] ans = new int[s];
        for (int i = 0; i < s; i++) {
            ans[i] = l.get(i) ;
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
        int[] result = separateDigits(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}
