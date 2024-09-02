package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class Maximum69Number {

//  Find first occurance of 6 and replace it with 9
/*    public static int maximum69Number (int num) {
        String s = String.valueOf(num);
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                break;
            }
        }
        System.out.println(i);
        String res = "";
        if(i==s.length())
            return num;
        else if(i<s.length()){
            System.out.println(s.substring(0,i));
            res = s.substring(0,i)+'9'+s.substring(i+1,s.length());
        }
        return Integer.parseInt(res);
    }
*/
    public static int maximum69Number (int num) {
        String s = "" + num;
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(maximum69Number(num));
    }
}
