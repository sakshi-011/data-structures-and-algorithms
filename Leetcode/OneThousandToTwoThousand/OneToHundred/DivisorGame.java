package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;

public class DivisorGame {

    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(divisorGame(n));
    }

}
