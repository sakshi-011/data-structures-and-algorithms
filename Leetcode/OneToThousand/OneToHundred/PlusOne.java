package Leetcode.OneToThousand.OneToHundred;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int [n+1];
        res[0] = 1;

        return res;
    }

    /*
    public static int[] plusOne(int[] digits) {
        int carry = 0, sum = 0, n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            sum = digits[i] + carry + (i==n-1 ? 1:0);
            carry = sum / 10;
            digits[i] = sum % 10;
            if(carry==0)
                return digits;
        }
        if(carry == 1){
            int[] res = new int[digits.length+1];
            res[0] = carry;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i-1];
            }
            return res;
        }
        return digits;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] digits = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            digits[i] = Integer.valueOf(str[i]);
        }
        System.out.println(Arrays.toString(plusOne(digits)));
    }

}
