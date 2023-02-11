package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountPrimes {

    public static int countPrimes(int n) {
        if(n <= 1)
            return 0;
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(notPrime[i])
                continue;
            count++;
            for (int j = 1; i*j < n; j++) {
                notPrime[i*j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countPrimes(n));
    }

}
