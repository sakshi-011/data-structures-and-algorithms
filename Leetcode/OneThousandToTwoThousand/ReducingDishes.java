package Leetcode.OneThousandToTwoThousand;

import java.util.Arrays;
import java.util.Scanner;

public class ReducingDishes {

    public static int maxSatisfaction(int[] satisfaction) {
        boolean isPos = false;
        for(int x : satisfaction)
            if(x>0)
                isPos = true;
        if(!isPos)
            return 0;
        Arrays.sort(satisfaction);
        int res = 0, total = 0, n = satisfaction.length;
        for (int i = n - 1; i >= 0 && satisfaction[i] > -total; --i) {
            total += satisfaction[i];
            res += total;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] satisfaction = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            satisfaction[i] = Integer.valueOf(str[i]);
        }
        System.out.println(maxSatisfaction(satisfaction));
    }

}
