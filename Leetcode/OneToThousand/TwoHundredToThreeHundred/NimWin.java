package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
public class NimWin {

    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(canWinNim(n));
    }

}
