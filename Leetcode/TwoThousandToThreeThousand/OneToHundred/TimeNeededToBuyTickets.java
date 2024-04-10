package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import java.util.Scanner;

public class TimeNeededToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int required = tickets[k];
        if(required == 1)
            return k+1;
        int count = 0;
        for(int i = 0; i < tickets.length; i++){
            if(i <= k)
                count += Math.min(tickets[i],required);
            else
                count += Math.min(tickets[i],required - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] tickets = new int[st.length];
        for(int i = 0; i < st.length; i++){
            tickets[i] = Integer.valueOf(st[i]);
        }
        System.out.println(timeRequiredToBuy(tickets,k));
    }
}
