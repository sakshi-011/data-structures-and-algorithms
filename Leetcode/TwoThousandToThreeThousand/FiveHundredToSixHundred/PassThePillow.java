package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class PassThePillow {

    public static int passThePillow(int n, int time) {
        int x = time / (n-1);
        if(x % 2 == 0)
            return time % (n - 1) + 1;
        else
            return n - time % (n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int time = in.nextInt();
        System.out.println(passThePillow(n,time));
    }
}
