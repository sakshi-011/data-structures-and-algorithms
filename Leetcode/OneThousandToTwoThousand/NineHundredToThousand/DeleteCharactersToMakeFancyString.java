package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.Scanner;

public class DeleteCharactersToMakeFancyString {

    public static String makeFancyString(String s) {
        if(s.length() <= 2)
            return s;
        StringBuilder ans = new StringBuilder();
        char last = s.charAt(1), secondLast = s.charAt(0);
        ans.append(secondLast).append(last);
        char[] arr = s.toCharArray();
        for(int i = 2; i < arr.length; i++){
            if(secondLast == last) {
                if(arr[i] != last)
                    ans.append(arr[i]);
            } else {
                ans.append(arr[i]);
            }
            secondLast = last;
            last = arr[i];
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(makeFancyString(s));
    }
}
