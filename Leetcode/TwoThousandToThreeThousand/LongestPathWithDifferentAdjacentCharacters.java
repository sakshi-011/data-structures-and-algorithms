package Leetcode.TwoThousandToThreeThousand;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class LongestPathWithDifferentAdjacentCharacters {

    private static int longestPath = 1;

    public static int dfs(int currentNode, Map<Integer, List<Integer>> children, String s) {
        if (!children.containsKey(currentNode)) {
            return 1;
        }

        int longestChain = 0, secondLongestChain = 0;
        for (int child : children.get(currentNode)) {

            int longestChainStartingFromChild = dfs(child, children, s);
            if (s.charAt(currentNode) == s.charAt(child)) {
                continue;
            }
            if (longestChainStartingFromChild > longestChain) {
                secondLongestChain = longestChain;
                longestChain = longestChainStartingFromChild;
            } else if (longestChainStartingFromChild > secondLongestChain) {
                secondLongestChain = longestChainStartingFromChild;
            }
        }

        longestPath = Math.max(longestPath, longestChain + secondLongestChain + 1);
        return longestChain + 1;
    }

    public static int longestPath(int[] parent, String s) {
        int n = parent.length;
        Map<Integer, List<Integer>> children = new HashMap<>();
        for (int i = 1; i < n; i++) {
            children.computeIfAbsent(parent[i], value -> new ArrayList<Integer>()).add(i);
        }

        dfs(0, children, s);

        return longestPath;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] parent = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            parent[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        System.out.println(longestPath(parent,s));
    }
}
