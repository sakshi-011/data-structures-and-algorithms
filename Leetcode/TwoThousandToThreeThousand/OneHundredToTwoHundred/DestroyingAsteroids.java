package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Arrays;

public class DestroyingAsteroids {

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        for(int a : asteroids){
            if(m < a )
                return false;
            m += a;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(asteroidsDestroyed(10, new int[]{3,9,19,5,21}));
        System.out.println(asteroidsDestroyed(5, new int[]{4,9,23,4}));
    }
}
