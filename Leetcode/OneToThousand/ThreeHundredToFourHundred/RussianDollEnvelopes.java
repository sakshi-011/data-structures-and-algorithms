package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.Arrays;

public class RussianDollEnvelopes {

    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length, max = 0;
        if(n == 1)
            return 1;
        Arrays.sort(envelopes, (a,b) -> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);

        int[] arr = new int[n];
        int size = 0;
        for(int[] envelope: envelopes) {
            int left = 0, right = size, middle = 0;
            while(left < right) {
                middle = left + (right - left) / 2;
                if(arr[middle] < envelope[1]) {
                    left = middle + 1;
                } else {
                    right = middle;
                }
            }
            arr[left] = envelope[1];
            if(left == size) size++;
        }
        return size;
    }

    /*
    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length, max = 0;
        if(n == 1)
            return 1;
        Arrays.sort(envelopes, (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        int[] arr = new int[n];
        arr[n-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if(envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]){
                    arr[i] = Math.max(arr[i],arr[j]+1);
                }
            }
            max = Math.max(max,arr[i]);
        }
        return max+1;
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] envelops = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]","").split(",");
            envelops[i][0] = Integer.valueOf(st[0]);
            envelops[i][1] = Integer.valueOf(st[1]);
        }
        System.out.println(maxEnvelopes(envelops));
    }

}
