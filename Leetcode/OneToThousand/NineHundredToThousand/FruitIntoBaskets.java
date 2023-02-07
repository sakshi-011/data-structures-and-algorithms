package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, right;

        for (right = 0; right < fruits.length; ++right) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            if (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0)
                    basket.remove(fruits[left]);
                left++;
            }
        }
        return right - left;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] fruits = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            fruits[i] = Integer.valueOf(str[i]);
        }
        System.out.println(totalFruit(fruits));
    }

}
