package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FindAllAnagramsInAString {

    public static boolean matches(int[] a, int[] b){
        for (int i = 0; i < 26; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int l1 = s.length(), l2 = p.length(), i = 0;
        List<Integer> ans = new ArrayList<>();
        if(l1<l2)
            return ans;
        int[] countP = new int[26];
        int[] countS = new int[26];
        for (i = 0; i < l2; i++) {
            countP[p.charAt(i)-'a']++;
            countS[s.charAt(i)-'a']++;
        }
        for (i = 0; i < l1-l2; i++) {
            if(matches(countP,countS))
                ans.add(i);
            countS[s.charAt(i) - 'a']--;
            countS[s.charAt(i+l2) - 'a']++;
        }
        if(matches(countP,countS))
            ans.add(i);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = in.next();
        System.out.println(findAnagrams(s,p).toString());
    }

}
