package Hackerrank.Stack;

import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
    
    public static String checkBalance(String s){
        
        Stack<Character> stack = new Stack<Character>();

            stack.clear();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == '{')
                    stack.push('}');
                else if(s.charAt(j) == '(')
                    stack.push(')');
                else if(s.charAt(j) == '[') 
                    stack.push(']');
                else if(!stack.empty()){
                        if(s.charAt(j) != stack.pop()){
                            return "NO";
                        }
                }
                else if(stack.empty()){
                    return "NO";
                }
            }
            return stack.empty() ? "YES" : "NO";
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s = in.next();
            System.out.println(checkBalance(s));
        }
    }
}
