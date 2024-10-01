package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;

public class AddDigits {

    public static int addDigits(int num) {
        while(num >= 10){
            int temp = num, sum = 0;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(addDigits(n));
    }
}
