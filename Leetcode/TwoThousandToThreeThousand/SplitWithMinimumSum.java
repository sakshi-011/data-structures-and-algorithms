package Leetcode.TwoThousandToThreeThousand;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWithMinimumSum {

    public static int splitNum(int num) {
        String s = num+"";
        int[] arr = new int[s.length()];
        for (int i = 0, j = 0; i < s.length(); i++) {
            arr[j++] = Integer.parseInt(s.charAt(i)+"");
        }
        Arrays.sort(arr);
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
                num1 = num1*10+arr[i];
            else
                num2 = num2*10+arr[i];
        }
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(splitNum(x));
    }

}
