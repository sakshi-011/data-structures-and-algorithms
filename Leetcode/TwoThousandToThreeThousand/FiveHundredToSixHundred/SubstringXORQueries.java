package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringXORQueries {

    public static int[][] substringXorQueries(String s, int[][] queries) {
        int x, n = s.length(), temp, idx=0;
        Map<Integer,int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') {
                temp = 0;
                for (int j = i; j < Math.min(n, i + 30); j++) {
                    temp *= 2;
                    if(s.charAt(j) == '1')
                        temp++;
                    if(!map.containsKey(temp))
                        map.put(temp,new int[]{i,j});
                }
            }else if(!map.containsKey(0))
                map.put(0,new int[]{i,i});
        }
        int[][] ans = new int[queries.length][2];
        for(int[] q : queries){
            x = q[0] ^ q[1];
            if(map.containsKey(x))
                ans[idx++] = map.get(x);
            else
                ans[idx++] = new int[]{-1,-1};
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] queries = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            if(st[0].length() == 0)
                break;
            queries[i][0] = Integer.valueOf(st[0]);
            queries[i][1] = Integer.valueOf(st[1]);
        }
        int[][] ans = substringXorQueries(t,queries);
        for(int[] a : ans){
            System.out.println(a[0]+","+a[1]);
        }
    }

}
