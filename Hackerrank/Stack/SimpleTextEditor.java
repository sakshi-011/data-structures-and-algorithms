package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      int n = in.nextInt();
      String str = "";
      Stack<String> stack = new Stack<String>();
      
      for(int i=0;i<n;i++){
          int op = in.nextInt();
          if(op == 1) {
            stack.push(str);
            str += in.next();
          }else if(op == 2){
            stack.push(str);
            str = str.substring(0, str.length() - in.nextInt());
          } else if(op == 3){
              System.out.println(str.charAt(in.nextInt()-1));
          }else {
              str = stack.pop();
          }          
      }
    }
}
