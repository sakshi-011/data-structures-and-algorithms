package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int x : bills) {
            if (x == 5) {
                five++;
            } else if (x == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(lemonadeChange(nums));
    }
}
