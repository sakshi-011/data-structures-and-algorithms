package Leetcode.ThreeThousandToFourThousand.NineHundredToThousand;

import java.util.Scanner;

public class UniqueMiddleElement {

    public static boolean isMiddleElementUnique(int[] nums) {
        int[] count = new int[200];
        for(int x : nums){
            count[x]++;
        }
        if(count[nums[nums.length/2]] == 1)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(isMiddleElementUnique(nums));
    }
}
