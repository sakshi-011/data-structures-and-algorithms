package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.Scanner;

public class SumOfDigitsOfStringAfterConvert {

    public static int getLucky(String s, int k) {
        String n = "";
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            n += s.charAt(i) - 'a' + 1;
        for(int i = 0; i < n.length(); i++)
            sum += n.charAt(i) - '0';
        for(int i = 1; i < k; i++) {
            int sum2 = 0;
            while (sum > 0) {
                sum2 += sum % 10;
                sum /= 10;
            }
            sum = sum2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        System.out.println(getLucky(s,k));
    }
}
