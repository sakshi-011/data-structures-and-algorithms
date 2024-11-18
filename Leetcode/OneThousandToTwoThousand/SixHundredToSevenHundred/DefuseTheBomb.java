package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {
        int n = code.length, sum = 0;

        if(k == 0)
            return new int[n];

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0) {
                for(int t = 1; t <= k; t++) {
                    sum += code[(i + t + n) % n];
                }
                for(int t = -1; t >= k; t--) {
                    sum += code[(i + t + n) % n];
                }
            } else{
                if(k > 0)
                    sum = sum - code[i] + code[(i + k) % n];
                else
                    sum = sum + code[i - 1] - code[(i + k - 1 + n) % n];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int k = in.nextInt();
        int[] ans = decrypt(nums, k);
        for(int c : ans)
            System.out.print(c+" ");
    }
}
