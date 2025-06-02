package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Arrays;

public class Candy {

    public static int candy(int[] ratings) {
        int candies[] = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 1; i < candies.length; i++){
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        }

        for (int i = candies.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], (candies[i + 1] + 1));
        }

        int sum = 0;
        for (int candy : candies)
            sum += candy;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] ratings = new int[st.length];
        for(int i = 0; i < st.length; i++){
            ratings[i] = Integer.parseInt(st[i]);
        }
        System.out.println(candy(ratings));
    }
}
