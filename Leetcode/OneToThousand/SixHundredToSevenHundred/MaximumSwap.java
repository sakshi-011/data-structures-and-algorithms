package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class MaximumSwap {

    public static int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        int[] maxRight = new int[n];

        maxRight[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; --i) {
            maxRight[i] = (numArr[i] > numArr[maxRight[i + 1]]) ? i : maxRight[i + 1];
        }

        for (int i = 0; i < n; ++i) {
            if (numArr[i] < numArr[maxRight[i]]) {
                char temp = numArr[i];
                numArr[i] = numArr[maxRight[i]];
                numArr[maxRight[i]] = temp;
                return Integer.parseInt(new String(numArr));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(maximumSwap(num));
    }
}
