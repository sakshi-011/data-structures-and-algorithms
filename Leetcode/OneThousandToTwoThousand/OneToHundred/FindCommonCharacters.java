package Leetcode.OneThousandToTwoThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {
        int[] firstCount = new int[26];
        boolean first = true;
        for(String word : words){
            if(first){
                for(char c : word.toCharArray())
                    firstCount[c-'a']++;
                first = false;
            }
            int[] count = new int[26];
            for(char c : word.toCharArray())
                count[c-'a']++;
            for(int i = 0; i < 26; i++){
                firstCount[i] = Math.min(firstCount[i],count[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < firstCount[i]; j++){
                char c = (char)('a' + i);
                ans.add(c+"");
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] words = s.replaceAll("\\[\"","").replaceAll("\"]","").split("\",\"");
        List<String> ans = commonChars(words);
        for(String t : ans)
            System.out.print(t+" ");
    }
}
