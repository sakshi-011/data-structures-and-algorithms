package Leetcode.OneToThousand.SixHundredToSevenHundred;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ReplaceWords {

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Set<String> dictSet = new HashSet<>(dictionary);

        for (int i = 0; i < words.length; i++) {
            words[i] = shortestRoot(words[i], dictSet);
        }
        return String.join(" ", words);
    }

    private static String shortestRoot(String word, Set<String> dictSet) {
        for (int i = 1; i <= word.length(); i++) {
            String root = word.substring(0, i);
            if (dictSet.contains(root)) {
                return root;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String s = in.next();
        String sentence = in.next();
        String[] st = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        List<String> dictionary = new ArrayList<>(Arrays.asList(st));
        System.out.println(replaceWords(dictionary,sentence));
    }
}
