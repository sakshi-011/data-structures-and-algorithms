package Leetcode.ThreeThousandToFourThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class UnitConversion1 {

    public static int[] baseUnitConversions(int[][] conversions) {
        int n = conversions.length + 1;
        long M = 1000000007;
        int[] values = new int[n];
        values[0] = 1;
        for(int[] row : conversions){
            if(row[0] == 0)
                values[row[1]] = (int) (row[2] % M);
            else{
                values[row[1]] = (int) (((long)values[row[0]] * row[2]) % M);
            }
        }
        return values;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] nums = new int[st.length][3];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            nums[i][0] = Integer.parseInt(t[0]);
            nums[i][1] = Integer.parseInt(t[1]);
            nums[i][2] = Integer.parseInt(t[2]);
        }

        int[] ans = baseUnitConversions(nums);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
