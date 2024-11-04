package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class StringCompression3 {

    public static String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        char prev = word.charAt(0), last;
        for(char c : word.toCharArray()){
            if(c == prev)
                count++;
            else {
                while(count > 9) {
                    ans.append(9).append(prev);
                    count -= 9;
                }
                if(count != 0)
                    ans.append(count).append(prev);
                count = 1;
            }
            prev = c;
        }
        while(count > 9) {
            ans.append(9).append(prev);
            count -= 9;
        }
        if(count != 0)
            ans.append(count).append(prev);
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(compressedString(s));
    }
}
