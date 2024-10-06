package Leetcode.OneThousandToTwoThousand.EightHundredToNineHundred;

import java.util.Scanner;
public class SentenceSimilarity3 {

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1Words = sentence1.split(" "), s2Words = sentence2.split(" ");
        int start = 0, ends1 = s1Words.length - 1, ends2 = s2Words.length - 1;
        int s1WordsLength = s1Words.length, s2WordsLength = s2Words.length;

        if (s1WordsLength > s2WordsLength) {
            return areSentencesSimilar(sentence2, sentence1);
        }

        while (start < s1WordsLength && s1Words[start].equals(s2Words[start])) {
            ++start;
        }
        while (ends1 >= 0 && s1Words[ends1].equals(s2Words[ends2])) {
            --ends1;
            --ends2;
        }
        return ends1 < start;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sen1 = in.nextLine();
        String sen2 = in.nextLine();
        System.out.println(areSentencesSimilar(sen1, sen2));
    }
}
