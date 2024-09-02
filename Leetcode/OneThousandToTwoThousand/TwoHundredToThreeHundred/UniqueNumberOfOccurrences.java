package Leetcode.OneThousandToTwoThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {

    /*
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int val=arr[0], count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != val) {
                if (set.contains(count))
                    return false;
                else set.add(count);
                val = arr[i];
                count = 1;
            } else{
                count++;
            }
        }
        if (set.contains(count))
            return false;
        else
            return true;
    }
    */

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        String[] strArray = inp.replaceAll("\\[", "").replaceAll("]","").split(",");
        int[] arr = new int[strArray.length];
        for(int i=0;i< strArray.length;i++){
            arr[i] = Integer.valueOf(strArray[i]);
        }
        System.out.println(uniqueOccurrences(arr));
    }
}
