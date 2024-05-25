package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex == 0){
            return ans;
        }
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            ans.add((int) next_val);
            prev = next_val;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> ans = getRow(n);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
