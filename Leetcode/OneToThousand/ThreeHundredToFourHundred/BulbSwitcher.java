package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class BulbSwitcher {

    public static int bulbSwitch(int n) {
        if(n == 0 || n == 1)
            return n;
        return (int)Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(bulbSwitch(n));
    }

}
