package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0, res = 0, g = 0;
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(gasSum < costSum){
            return -1;
        }

        for (int i = 0; i < gas.length; i++) {
            g += gas[i] - cost[i];
            if(g<0){
                res = i+1;
                g = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] gas = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            gas[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] cost = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            cost[i] = Integer.valueOf(str[i]);
        }
        System.out.println(canCompleteCircuit(gas,cost));
    }

}
