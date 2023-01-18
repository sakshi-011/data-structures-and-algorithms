package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >=0 ; i--) {
            if(s.charAt(i) != ' '){
                res++;
            }else{
                if(res>0) return res;
            }
        }
        return res;
    }

    /*
    public static int lengthOfLastWord(String s){
        String[] str = s.trim().split(" ");
        return str[str.length-1].trim().length();
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

}
