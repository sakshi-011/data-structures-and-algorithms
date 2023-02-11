package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        int ans = -1;
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                if(stack.size() < 2)
                    return -1;
                int b = stack.pop();
                int a = stack.pop();
                switch(s){
                    case "+" : ans = a + b;
                               break;
                    case "-" : ans = a - b;
                               break;
                    case "*" : ans = a * b;
                                break;
                    case "/" : ans = a / b;
                               break;
                }
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] tokens = s.replaceAll("\\[","").replaceAll("]","")
                .replaceAll("\"","").split(",");
        System.out.println(evalRPN(tokens));
    }

}
