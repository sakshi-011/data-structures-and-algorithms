package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class NumberOfLaserBeamsInABank {

    public static int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0, count;
        for(String row : bank){
            count = 0;
            for(char c : row.toCharArray()){
                if(c == '1')
                    count++;
            }
            if(count > 0){
                ans += prev * count;
                prev = count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] bank = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        System.out.println(numberOfBeams(bank));
    }
}
