package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;
import java.util.Stack;
public class ValidateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length != popped.length)
            return false;
        Stack<Integer> st = new Stack<>();
        int ptr = 0;
        for(int i = 0; i < pushed.length; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[ptr]) {
                st.pop();
                ptr++;
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] pushed = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            pushed[i] = Integer.valueOf(str[i]);
        }
        s = in.next();
        str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] popped = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            popped[i] = Integer.valueOf(str[i]);
        }
        System.out.println(validateStackSequences(pushed,popped));
    }

}
