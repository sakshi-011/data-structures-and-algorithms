package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        long mid = 0;
        while(l <= r){
            mid = (l+r)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid > num){
                r = (int)mid-1;
            }else{
                l = (int)mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPerfectSquare(num));
    }

}
