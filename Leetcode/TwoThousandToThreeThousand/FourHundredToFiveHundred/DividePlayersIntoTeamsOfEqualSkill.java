package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DividePlayersIntoTeamsOfEqualSkill {

    public static long dividePlayers(int[] skill) {
        long ans = 0, sum = 0;
        int n = skill.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : skill) {
            sum += x;
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        if(sum % (n / 2) != 0)
            return -1;

        int target = (int) sum / (n / 2);

        for(int x : map.keySet()){
            int freq = map.get(x);
            if(!map.containsKey(target - x) || freq != map.get(target - x))
                return -1;
            ans += (long) x * (target - x) * freq;
        }
        return ans / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(dividePlayers(nums));
    }
}
