package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumNumberOfPushesToTypeWord2 {

    public static int minimumPushes(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> frequencyQueue = new PriorityQueue<>(
                (a, b) -> b - a
        );
        frequencyQueue.addAll(frequencyMap.values());

        int totalPushes = 0;
        int index = 0;

        while (!frequencyQueue.isEmpty()) {
            totalPushes += (index / 8 + 1) * frequencyQueue.poll();
            index++;
        }

        return totalPushes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(minimumPushes(s));
    }
}
