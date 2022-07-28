package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
    
    public static int getMaxCount(int maxSum, Stack<Integer> stack1, Stack<Integer> stack2){
        int i=0,j=0,max=0,count=0,x;
        //greedy approach
        /*
        a = stack1.pop();
        b = stack2.pop();
        while(max <= maxSum){
            //System.out.print(a+" "+b+" "+max+" "+count+",");
            
            if(a <= b){
                max += a;
                count = max <= maxSum ? ++count : count;
                a = stack1.empty() ? Integer.MAX_VALUE : stack1.pop();
            }
            else{
                max += b;
                count = max <= maxSum ? ++count : count;
                b = stack2.empty() ? Integer.MAX_VALUE : stack2.pop();
            }
            if(stack1.empty() && stack2.empty())
                break;
        }
        return count;
        */
        
        Stack<Integer> temp = new Stack<Integer>();
            
        while(!stack1.empty()){
            x = stack1.pop();
            if(max+x > maxSum)
                break;
            max += x;
            temp.push(x);
            i++;
        }
        count = i;
//        System.out.println(count);

        while(!stack2.empty() && i>=0){
            max += stack2.pop();
            j++;
            while(max > maxSum && i>0){
                i--;
                max -= temp.pop();
            }
            if(max <= maxSum && i+j > count)
                count = i+j;
//            System.out.println(count);
        }
        
        return count;
    }
        
    public static void main(String[] args){
        int i,j;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(i=0;i<n;i++){
            int p = in.nextInt();
            int q = in.nextInt();
            int maxSum = in.nextInt();
            
            Stack<Integer> stack1 = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();
            Stack<Integer> temp = new Stack<Integer>();
            
            for(j=0;j<p;j++){
                temp.push(in.nextInt());
            }
            while(!temp.empty()){
                stack1.push(temp.pop());
            }
            
            for(j=0;j<q;j++){
                temp.push(in.nextInt());
            }
            while(!temp.empty()){
                stack2.push(temp.pop());
            }
            
            System.out.println(getMaxCount(maxSum,stack1,stack2));
        }
    }
}