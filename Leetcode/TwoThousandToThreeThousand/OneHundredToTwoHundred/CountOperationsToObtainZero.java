package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class CountOperationsToObtainZero {

    public static int countOperations(int num1, int num2) {
        int ans = 0;
        while(num1 != 0 && num2 != 0){
            ans += num1 / num2;
            num1 = num1 % num2;
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(countOperations(num1, num2));
    }

}
