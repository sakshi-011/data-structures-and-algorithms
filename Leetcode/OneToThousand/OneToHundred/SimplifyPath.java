package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        String[] folders = path.split("/");
        String ans = "";
        Stack<String> stack = new Stack<>();
        for(String s: folders){
            if(!stack.isEmpty() && s.equals(".."))
                stack.pop();
            else if(!(s.isEmpty() || s.equals(".")) && !s.equals("..")){
                stack.push(s);
            }
        }
        if(stack.isEmpty())
            return "/";
        while(!stack.isEmpty()){
            ans = "/" + stack.pop() + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.next();
        System.out.println(simplifyPath(path));
    }
}
