package Leetcode.TwoThousandToThreeThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class AddingSpacesToAString {

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0;

        for (int stringIndex = 0; stringIndex < s.length(); stringIndex++) {
            if (spaceIndex < spaces.length && stringIndex == spaces[spaceIndex]) {
                result.append(' ');
                spaceIndex++;
            }
            result.append(s.charAt(stringIndex));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String originalString = in.nextLine();
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] spaces = new int[st.length];
        for(int i = 0; i < st.length; i++){
            spaces[i] = Integer.parseInt(st[i]);
        }
        System.out.println(addSpaces(originalString, spaces));
    }
}
