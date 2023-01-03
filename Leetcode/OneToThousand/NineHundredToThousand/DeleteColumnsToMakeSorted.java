package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;

public class DeleteColumnsToMakeSorted {

    public static int minDeletionSize(String[] strs) {
        int K = strs[0].length();
        int res = 0;
        for (int col = 0; col < K; col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    res++;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] strs = s.split("\",");
        for (int i=0;i<strs.length;i++) {
            strs[i] = strs[i].replaceAll("\\[","").replaceAll("]","").replaceAll("\"","");
        }
        System.out.println(minDeletionSize(strs));
    }

}
