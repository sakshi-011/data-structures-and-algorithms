package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
public class FlipStringToMonotoneIncreasing {

    public static int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] prefixZero = new int[n];
        int[] prefixOne = new int[n];
        prefixZero[0] = s.charAt(0) == '0' ? 1 : 0;
        prefixOne[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i) == '0'){
                prefixZero[i] = prefixZero[i-1] + 1;
                prefixOne[i] = prefixOne[i-1];
            }else{
                prefixZero[i] = prefixZero[i-1];
                prefixOne[i] = prefixOne[i-1] + 1;
            }
        }
        int totalZero = prefixZero[n-1], totalOne = prefixOne[n-1], temp = 0, res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            temp = prefixOne[i] + (totalZero - prefixZero[i]);
            res = Math.min(res,temp);
        }
        return Math.min(res,Math.min(totalOne,totalZero));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        System.out.println(minFlipsMonoIncr(s));
    }

}
