package Leetcode.Miscellaneous;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static boolean isSelfDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();

        List<Integer> ans = selfDividingNumbers(left, right);
        for(int i : ans){
            System.out.print(i+",");
        }
    }
}
