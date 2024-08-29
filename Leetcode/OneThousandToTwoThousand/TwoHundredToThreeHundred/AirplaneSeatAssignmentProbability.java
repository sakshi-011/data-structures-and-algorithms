package Leetcode.OneThousandToTwoThousand;

import java.util.Scanner;

public class AirplaneSeatAssignmentProbability {

    public static double nthPersonGetsNthSeat(int n) {
        double ans = 1.00000;
        if (n == 1)
            return ans;
        else{
            ans = 1.0 / n;
            for (int i = 1; i < n-1; i++) {
                ans *= (1.0 + 1.0/(n-i));
            }
        }
        return 1-ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(nthPersonGetsNthSeat(n));
    }

}
