package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(x * 2) || (x % 2 == 0 && set.contains(x / 2)))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(checkIfExist(nums));
    }
}
