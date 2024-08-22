package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class NumberComplement {

    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder xorResult = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            xorResult.append(bit == '0' ? '1' : '0');
        }
        return Integer.parseInt(xorResult.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(findComplement(num));
    }
}
