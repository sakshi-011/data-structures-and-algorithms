package Hackerrank.Stack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Waiter {
    
    public static ArrayList<Integer> getPrimes(int n){
        ArrayList<Integer> p = new ArrayList<Integer>();
        p.add(2);
        for(int i=3; p.size()<n; i+=2){
            boolean isPrime = true;
            for (int num=0;num<p.size() && p.get(num)<=Math.sqrt(i);num++){
                if(i%p.get(num) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                p.add(i);
        }
        return p;
    }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int l = in.nextInt();
        int n = in.nextInt();
        
        ArrayList<Integer> p = getPrimes(n);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        
        for(int i=0;i<l;i++){
            a.push(in.nextInt());
        }
        
        for(int i=0;i<n;i++){
            while(!a.empty()){
                int x = a.pop();
                if(x % p.get(i) == 0){
                    b.push(x);
                }
                else 
                    temp.add(x);
            }
            while(!b.empty()){
                answer.add(b.pop());
            }
            for(int q=0;q<temp.size();q++){
                a.push(temp.get(q));
            }
            temp.clear();
        }
        
        while(!a.empty()){
            answer.add(a.pop());
        }
        
        for(int i=0;i<answer.size();i++)
            System.out.println(answer.get(i)+" ");
    }
}
