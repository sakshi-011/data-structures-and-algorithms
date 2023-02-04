package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class CountAndSay {

    public static String count(String s){
        if(s.equals("1"))
            return "11";
        int c = 1, l = s.length(), i;
        String ans = "";
        for (i = 0; i < l-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }else{
                ans += ""+c+s.charAt(i);
                c = 1;
            }
        }
        ans += ""+c+s.charAt(l-1);
        return ans;
    }

    public static String countAndSay(int n) {
        if(n == 1)
            return "1";
        String curr = "1";
        for (int i = 2; i <= n; i++) {
            curr = count(curr);
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countAndSay(n));
    }

}
