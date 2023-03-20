package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0){
                int prev = i == 0 ? 0 : flowerbed[i-1];
                int next = i == flowerbed.length-1 ? 0 : flowerbed[i+1];
                if(prev != 1 && next != 1){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] flowerbed = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            flowerbed[i] = Integer.valueOf(str[i]);
        }
        int n = in.nextInt();
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

}
