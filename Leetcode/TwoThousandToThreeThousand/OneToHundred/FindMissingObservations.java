package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import java.util.Scanner;

public class FindMissingObservations {

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        long sum = 0;
        for(int x : rolls)
            sum += x;
        long total = (long) (n + m) * mean;
        int remainingSum = (int) (total - sum);
        if(remainingSum >  n * 6 || remainingSum < n)
            return new int[0];

        int[] ans = new int[n];
        int distributeMean = remainingSum / n;
        int mod = remainingSum % n;
        for(int i = 0; i < n; i++){
            ans[i] = distributeMean;
            if(i < mod)
                ans[i]++;
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
        int mean = in.nextInt();
        int n = in.nextInt();
        int[] ans = missingRolls(nums,mean,n);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
