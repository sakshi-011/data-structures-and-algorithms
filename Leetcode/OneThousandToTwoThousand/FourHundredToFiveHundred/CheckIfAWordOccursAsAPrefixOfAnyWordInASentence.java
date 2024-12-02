package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.trim().split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= searchWord.length()) {
                if(words[i].substring(0,searchWord.length()).equals(searchWord))
                    return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String w = in.next();
        System.out.println(isPrefixOfWord(s, w));
    }
}
