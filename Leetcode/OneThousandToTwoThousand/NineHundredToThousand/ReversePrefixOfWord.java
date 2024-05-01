package Leetcode.OneThousandToTwoThousand.NineHundredToThousand;

import java.util.Scanner;

public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        int n = word.length(), idx = -1;
        if(n == 1)
            return word;
        String ans = "";
        for(int i = 0; i < n; i++){
            char c = word.charAt(i);
            ans = c+ans;
            if(c == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1)
            return word;
        if(idx != n-1)
            ans = ans + word.substring(idx+1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char ch = in.next().charAt(0);
        System.out.println(reversePrefix(word,ch));
    }
}
