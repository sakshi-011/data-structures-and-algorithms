package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlants {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0,max = 0;
        
        int n = in.nextInt();
        int min = in.nextInt();
        int[] inp = new int[n];
        int[] days = new int[n];
        
        stack.push(0);
        inp[0]=min;
        
         for(int i=1;i<n;i++){
            int x = in.nextInt();
            inp[i]=x;
         }
        
        for(int i=1;i<n;i++){
            if(inp[i-1] < inp[i])
                days[i]=1;
            if(inp[i]<min)
                min = inp[i];
            while(!stack.empty() && inp[stack.peek()] >= inp[i]){
                if(inp[i] > min){
                    if(days[i] < days[stack.peek()]+1)
                        days[i] = days[stack.peek()]+1;
                }
                stack.pop();
            }
            if(max < days[i])
                max = days[i];
            stack.push(i);
        }
        
        System.out.println(max);
    }
}
