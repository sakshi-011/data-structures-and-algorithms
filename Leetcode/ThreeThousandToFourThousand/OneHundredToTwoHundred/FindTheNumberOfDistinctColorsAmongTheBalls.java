package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class FindTheNumberOfDistinctColorsAmongTheBalls {

    public static int[] queryResults(int limit, int[][] queries) {
        int[] ans = new int[queries.length];
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        int i = 0;
        for(int[] q : queries){
            if(map.containsKey(q[0])) {
                int colour = map.get(q[0]);
                if (colour != q[1]) {
                    colorCount.put(colour, colorCount.get(colour) - 1);
                    if (colorCount.get(colour) == 0) {
                        set.remove(colour);
                    }
                    map.put(q[0], q[1]);
                    colorCount.put(q[1], colorCount.getOrDefault(q[1], 0) + 1);
                    set.add(q[1]);
                }
            }else{
                map.put(q[0], q[1]);
                colorCount.put(q[1], colorCount.getOrDefault(q[1], 0) + 1);
                set.add(q[1]);
            }
            ans[i++] = set.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        String s = in.next();
        String[] st = s.replaceAll("\\[\\[","").replaceAll("]]","").split("],\\[");
        int[][] nums = new int[st.length][2];
        for(int i = 0; i < st.length; i++){
            String[] t = st[i].split(",");
            nums[i][0] = Integer.parseInt(t[0]);
            nums[i][1] = Integer.parseInt(t[1]);
        }
        int[] ans = queryResults(limit,nums);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
