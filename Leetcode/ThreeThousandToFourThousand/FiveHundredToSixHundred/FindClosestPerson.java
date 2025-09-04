package Leetcode.ThreeThousandToFourThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class FindClosestPerson {

    public static int findClosest(int x, int y, int z) {
        int diff1 = Math.abs(z - x), diff2 = Math.abs(z - y);

        if (diff1 == diff2)
            return 0;
        else if (diff1 < diff2)
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println(findClosest(x, y, z));
    }
}
