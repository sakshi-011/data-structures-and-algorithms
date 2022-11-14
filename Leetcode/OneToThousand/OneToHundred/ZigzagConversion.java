package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class ZigzagConversion {

    public static String convert(String s, int numRows){
        if(numRows == 1) return s;
        String ans = "";
        String[] str = new String[numRows];
        int idx=0;
        Boolean b=true;
        for(int i=0;i<str.length;i++){
            str[i]="";
        }
        for(int i=0;i<s.length();i++){
            str[idx]+=s.charAt(i);
            if((idx==0 && !b) || (idx==numRows-1 && b)){
                b=!b;
            }
            idx = b ? idx+1 : idx-1;

        }
        for(String a : str){
            ans+=a;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int rows = in.nextInt();
        String ans = convert(s,rows);
        System.out.println(ans);
    }
}
