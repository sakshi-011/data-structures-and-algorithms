package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class KthMissingPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k)
                k++;
            else
                break;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        int k = in.nextInt();
        System.out.println(findKthPositive(arr,k));
    }

}
