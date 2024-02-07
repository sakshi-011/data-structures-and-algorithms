package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i])
                max = candies[i];
        }
        for(int i = 0; i < candies.length; i++){
            answer.add(candies[i] + extraCandies >= max);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int extraCandies = in.nextInt();
        String[] st = str.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] candies = new int[st.length];
        int i = 0;
        for(String s : st)
            candies[i++] = Integer.valueOf(s);
        List<Boolean> answer = kidsWithCandies(candies,extraCandies);
        for(Boolean b : answer)
            System.out.print(b+" ");
    }
}
