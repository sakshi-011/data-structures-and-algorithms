package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LexicographicalNumbers {

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 1;
        for(int i = 0; i < n; i++){
            ans.add(num);
            if(num * 10 <= n) {
                num *= 10;
            } else {
                while(num % 10 == 9 || num >= n)
                    num /= 10;
                num++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> ans = lexicalOrder(n);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
