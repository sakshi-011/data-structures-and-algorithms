package Leetcode.OneToThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class ReverseString2 {

    public static String reverseStr(String s, int k) {
        char temp;
        char[] arr = s.toCharArray();
        for (int ptr = 0; ptr < s.length(); ptr += 2*k) {
            int i = ptr,j = Math.min(i + k - 1,s.length() - 1);
            while(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        System.out.println(reverseStr(s,k));
    }

}
