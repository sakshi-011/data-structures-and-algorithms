package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class FindTheTownJudge {

    public static int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        for (int i = 0; i < trust.length; i++) {
            count[trust[i][0]]--;
            count[trust[i][1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if(count[i] == n-1)
                return i;
        }
        return -1;
    }

    /*
    public static int findJudge(int n, int[][] trust) {
        if(n == 1)
            return n;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < trust.length; i++) {
            map.computeIfAbsent(trust[i][1],value -> new HashSet<Integer>()).add(trust[i][0]);
            set.add(trust[i][0]);
        }
        for(Map.Entry<Integer,Set<Integer>> e : map.entrySet()){
            if(e.getValue().size() == n-1 && !set.contains(e.getKey())){
                return e.getKey();
            }
        }
        return -1;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] trust = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            trust[i][0] = Integer.valueOf(st[0]);
            trust[i][1] = Integer.valueOf(st[1]);
        }
        System.out.println(findJudge(n,trust));
    }

}
