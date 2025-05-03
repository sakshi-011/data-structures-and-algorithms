package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;

public class MinimumDominoRotationsForEqualRow {

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int[] countA = new int[7], countB = new int[7], same = new int[7];
        int n = tops.length;
        for (int i = 0; i < n; ++i) {
            countA[tops[i]]++;
            countB[bottoms[i]]++;
            if (tops[i] == bottoms[i])
                same[tops[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (countA[i] + countB[i] - same[i] == n)
                return n - Math.max(countA[i], countB[i]);
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] tops = new int[st.length];
        for(int i = 0; i < st.length; i++){
            tops[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] bottoms = new int[st.length];
        for(int i = 0; i < st.length; i++){
            bottoms[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minDominoRotations(tops, bottoms));
    }
}
