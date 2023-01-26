package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.isEmpty())
            return list;
        list.add("");
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 0; i < digits.length(); i++){
            while(list.get(0).length() == i){
                String s = list.remove(0);
                for(char c : mapping[digits.charAt(i)-'0'].toCharArray()){
                    list.add(s+c);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String digits = in.next();
        System.out.println(letterCombinations(digits).toString());
    }

}
