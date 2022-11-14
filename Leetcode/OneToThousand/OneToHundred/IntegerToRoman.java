package Leetcode.OneToThousand.OneToHundred;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerToRoman {

    public static String intToRoman(int num){
        String s = "";
        final int [] ar = {1000,500,100,50,10,5,1};
        final char[] ch = {'M','D','C','L','X','V','I'};

        int x=0, p=0, prev=0;
        boolean[] dp = new boolean[7];
        while(num>0){
            x = num / ar[p];
            dp[p] = x > 0 ? true : false;
            char[] repeat;
            if(x==4 && dp[p-1] && (p==2 || p==4 || p==6)){
                repeat = new char[2];
                repeat[0] = ch[p];
                repeat[1] = ch[p-2];
                s=s.substring(0,s.length()-1);
            }
            else if(x==4 && !dp[p-1] && (p==2 || p==4 || p==6)){
                repeat = new char[2];
                repeat[0] = ch[p];
                repeat[1] = ch[p-1];
            }
            else{
                repeat = new char[x];
                Arrays.fill(repeat, ch[p]);
            }

            s+=new String(repeat);
            num = num % ar[p];
            p++;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(intToRoman(num));
    }
}
