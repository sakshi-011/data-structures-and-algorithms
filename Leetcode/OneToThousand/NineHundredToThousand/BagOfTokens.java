package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Arrays;
public class BagOfTokens {

    public static int bagOfTokensScore(int[] tokens, int power) {
        int score = 0, low = 0, high = tokens.length-1;
        Arrays.sort(tokens);

        while(low <= high){
            if(power >= tokens[low]){
                score++;
                power -= tokens[low];
                low++;
            } else if(score > 0 && low < high){
                score--;
                power += tokens[high];
                high--;
            } else {
                return score;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] tokens = new int[st.length];
        int i = 0;
        for(String t : st){
            tokens[i++] = Integer.valueOf(t);
        }
        int power = in.nextInt();
        System.out.println(bagOfTokensScore(tokens,power));
    }
}
