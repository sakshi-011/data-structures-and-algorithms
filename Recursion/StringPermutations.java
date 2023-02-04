package Recursion;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class StringPermutations {

    public static void permutations(String prefix, String s, Set<String> set){
        int n = s.length();
        if(n == 0)
            set.add(prefix);
        else{
            for (int i = 0; i < n; i++) {
                permutations(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n),set);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<String> ans = new HashSet<>();
        permutations("",s,ans);
        System.out.println(ans);
    }

}
