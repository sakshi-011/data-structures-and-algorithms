package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class AndXorOr {
    
    static int calc(int a, int b){
        return ((a & b)^(a | b)) & (a ^ b);
    }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        int max=0, temp=0;
        for(int i=0;i<n;i++){
            while(!stack.empty()){            
                temp = calc(arr[i],stack.peek());
                if(temp > max)
                    max = temp;
                if(arr[i]<stack.peek())
                    stack.pop();
                else break;
            }
            stack.push(arr[i]);
        }
        
        System.out.println(max);

    }
}
