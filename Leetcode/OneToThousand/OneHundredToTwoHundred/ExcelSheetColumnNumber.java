package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i <columnTitle.length(); i++) {
            ans *= 26;
            ans += columnTitle.charAt(i) - 'A' + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(titleToNumber(s));
    }

}
