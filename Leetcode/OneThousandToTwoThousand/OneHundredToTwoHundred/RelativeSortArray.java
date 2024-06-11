package Leetcode.OneThousandToTwoThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> remaining = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int value : arr2) {
            countMap.put(value, 0);
        }

        for (int value : arr1) {
            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                remaining.add(value);
            }
        }

        Collections.sort(remaining);

        for (int value : arr2) {
            for (int j = 0; j < countMap.get(value); j++) {
                result.add(value);
            }
        }

        result.addAll(remaining);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] arr1 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            arr1[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] arr2 = new int[st.length];
        for(int i = 0; i < st.length; i++){
            arr2[i] = Integer.parseInt(st[i]);
        }
        int[] ans = relativeSortArray(arr1,arr2);
        for(int x : ans)
            System.out.print(x+" ");
    }
}
