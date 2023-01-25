package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HappyNumber {

    //Floyd's cycle finding algo
    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    /*
    public static boolean isHappy(int n) {
        int sum;
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            sum = 0;
            while(n>0){
                int x = n % 10;
                sum += x * x;
                n = n / 10;
            }
            if(set.contains(sum))
                return false;
            else if(sum == 1)
                return true;
            set.add(sum);
            n = sum;
        }
        return n==1 ? true : false;
    }
     */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isHappy(n));
    }

}