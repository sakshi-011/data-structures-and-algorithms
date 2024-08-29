package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {

    public static boolean feasible(int[] weights, int days, int cap){
        int curr = 0, count = 1;
        for(int w : weights){
            curr += w;
            if(curr > cap){
                count++;
                curr = w;
            }
        }
        return count <= days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int total = 0, max = 0;
        for(int w : weights){
            max = Math.max(max,w);
            total += w;
        }
        int l = max, r = total, mid = 0;
        while(l < r){
            mid = l + (r - l) / 2;
            if(feasible(weights,days,mid))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] weights = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            weights[i] = Integer.valueOf(str[i]);
        }
        int days = in.nextInt();
        System.out.println(shipWithinDays(weights,days));
    }

}
