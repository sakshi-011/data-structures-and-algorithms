package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTasks {

    public static int minimumRounds(int[] tasks) {
        int res = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }
        for(Integer x: mp.values()){
            if(x == 1) {
                return -1;
            }else if(x % 3 == 0){
                res += x/3;
            }else {
                res += x/3 + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] tasks = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            tasks[i] = Integer.valueOf(str[i]);
        }
        System.out.println(minimumRounds(tasks));
    }

}
