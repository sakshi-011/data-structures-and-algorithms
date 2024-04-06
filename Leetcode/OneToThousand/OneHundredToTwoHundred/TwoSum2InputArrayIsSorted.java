package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TwoSum2InputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - numbers[i]))
                return new int[]{map.get(target - numbers[i]), i + 1};
            map.putIfAbsent(numbers[i], i + 1);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int target = in.nextInt();
        String[] st = s.replaceAll("\\[","").replace("]","").split(",");
        int[] num = new int[st.length];
        for(int i = 0; i < st.length; i++){
            num[i] = Integer.valueOf(st[i]);
        }
        int[] ans = twoSum(num,target);
        for(int x : ans)
            System.out.print(x+",");
    }
}
