package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;
import java.util.Arrays;

public class MovingStonesUntilConsecutive {

    public static int[] numMovesStones(int a, int b, int c) {
        int[] temp = {a,b,c};
        Arrays.sort(temp);
        int[] ans = new int[2];
        if(temp[2] - temp[0] == 2)
            return ans;
        ans[1] = temp[2] - temp[0] - 2;
        ans[0] = Math.min(temp[2]-temp[1],temp[1]-temp[0]) <= 2 ? 1 : 2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] ans = numMovesStones(a,b,c);
        System.out.println(ans[0]+","+ans[1]);
    }

}
