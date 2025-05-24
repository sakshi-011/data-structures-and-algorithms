package Leetcode.TwoThousandToThreeThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] words = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        char x = in.next().charAt(0);
        List<Integer> ans = findWordsContaining(words, x);
        for(int i : ans)
            System.out.print(i+" ");
    }
}
