package Leetcode.OneThousandToTwoThousand.SevenHundredToEightHundred;

import java.util.Scanner;

public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int sum = 0, max = 0;
        for(int i : gain){
            sum += i;
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(largestAltitude(nums));
    }
}
