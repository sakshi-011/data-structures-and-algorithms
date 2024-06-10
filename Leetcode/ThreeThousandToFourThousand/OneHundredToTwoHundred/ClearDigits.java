package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class ClearDigits {

    public static String clearDigits(String s) {
        String ans = "";
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int c = s.charAt(i) - '0';
            System.out.println(c);
            if(c >= 0 && c <= 9 ) {
                count++;
            }
            else {
                if(count == 0)
                    ans = s.charAt(i) + ans;
                else
                    count--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(clearDigits(s));
    }
}
