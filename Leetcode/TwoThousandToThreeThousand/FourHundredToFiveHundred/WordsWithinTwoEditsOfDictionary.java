package Leetcode.TwoThousandToThreeThousand.FourHundredToFiveHundred;

import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsOfDictionary {

    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        int n = queries[0].length(), count = 0;
        for(String w : queries){
            for(String d : dictionary) {
                count = 0;
                for (int i = 0; i < n; i++) {
                    if (w.charAt(i) != d.charAt(i))
                        count++;
                    if (count > 2) {
                        break;
                    }
                }
                if(count <= 2) {
                    result.add(w);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = twoEditWords(new String[]{"word", "note", "ants", "wood"},new String[]{"wood","joke","moat"});
        for(String s : result){
            System.out.print(s+" ");
        }
        System.out.println();
        result = twoEditWords(new String[]{"tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"},new String[]{"uyj","bug","dba","xbe","blu","wuo","tsf","tga"});
        for(String s : result){
            System.out.print(s+" ");
        }
    }
}
