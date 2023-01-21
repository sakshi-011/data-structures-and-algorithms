package Leetcode.OneToThousand.OneToHundred;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class RestoreIPAddresses {

    public static boolean isValid(String s){
        if(s.length() == 1) return true;
        if(s.charAt(0)!='0' && (s.length()<3 || Integer.parseInt(s) <= 255))
            return true;
        return false;
    }

    public static List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if(n<4 || n>12) return  new ArrayList<String>();
        Set<String> set = new HashSet<>();
        String s1, s2, s3, s4;
        for (int i = 0; i < 3 && i < n-3; i++) {
            s1 = s.substring(0,i+1);
            if(!isValid(s1))
                continue;
            for (int j = 0; j < 3 && j < n-2-s1.length(); j++) {
                s2 = s.substring(i+1,i+j+2);
                if(!isValid(s2))
                    continue;
                for (int k = 0; k < 3 && k < n-1-s1.length()-s2.length(); k++) {
                    s3 = s.substring(i+j+2,i+j+k+3);
                    s4 = s.substring(i+j+k+3,s.length());
                    if(!isValid(s3) || !isValid(s4))
                        continue;
                    set.add(s1+"."+s2+"."+s3+"."+s4);
                }
            }
        }
        List<String> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(restoreIpAddresses(s).toString());
    }

}
