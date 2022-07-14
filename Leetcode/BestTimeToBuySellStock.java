package Leetcode;

import java.util.Scanner;


public class BestTimeToBuySellStock {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] prices = new int[n];
        int i,temp=0,profit=0;
        for(i=0;i<n;i++)
            prices[i] = in.nextInt();
        
        int max=prices[n-1];

        for(i=n-1;i>=0;i--){
            if(prices[i]>max)
                max=prices[i];
            temp=max-prices[i];
            if(temp>profit)
                profit=temp;
        }
       System.out.print(profit);
    }
}
