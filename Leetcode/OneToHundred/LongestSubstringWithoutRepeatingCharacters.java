package Leetcode.OneToHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() >= 50000)
            return 0;
        char c;
        int j=0, max=0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                j++;
            }

            set.add(c);
            if(i-j+1 > max)
                max = i-j+1;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans = lengthOfLongestSubstring(s);
        System.out.print(ans);
    }
}
