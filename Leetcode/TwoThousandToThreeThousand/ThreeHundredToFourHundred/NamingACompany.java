package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NamingACompany {

    public static long distinctNames(String[] ideas) {
        int n = ideas.length;
        Set<String>[] dict = new HashSet[26];
        for (int i = 0; i < 26; i++) {
            dict[i] = new HashSet<>();
        }
        for (String s : ideas) {
            dict[s.charAt(0) - 'a'].add(s.substring(1));
        }

        long ans = 0;
        for (int i = 0; i < 25; i++) {
            for (int j = i+1; j < 26; j++) {
                long common = 0;
                for(String s : dict[i])
                    if(dict[j].contains(s))
                        common++;
                ans += 2 * (dict[i].size() - common) * (dict[j].size() - common);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] ideas = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        System.out.println(distinctNames(ideas));
    }

}
