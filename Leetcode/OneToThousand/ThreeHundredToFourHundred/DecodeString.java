package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        String decodedString = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> repStack = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = 10 * num + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(num);
            } else if (c == '[') {
                repStack.push(decodedString);
                decodedString = "";
                i++;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder (repStack.pop());
                int n = countStack.pop();
                for (int j = 0; j < n; j++) {
                    temp.append(decodedString);
                }
                decodedString = temp.toString();
                i++;
            } else {
                decodedString += c;
                i++;
            }
        }
        return decodedString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(decodeString(s));
    }
}
