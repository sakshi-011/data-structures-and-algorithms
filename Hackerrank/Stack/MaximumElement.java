package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	int n = in.nextInt(), i, x=0;
	int[] max = new int[n];
	boolean b=true;
	Stack<Integer> s = new Stack<Integer>();

	for(i=0;i<n;i++){
		int q = in.nextInt();
		switch(q){
			case 1: int p = in.nextInt();
				b = s.empty();
				s.push(p);
				if(b && x == 0)
					max[x] = p;
				else if(p > max[x])
					max[++x] = p;
				else {
					x++;
					max[x] = max[x-1];
				}
//				System.out.print(x+":"+max[x]+"("+p+"),");
                                break;
			case 2: p = s.pop();
				if(x > 0)
					x--;
				break;
			case 3: System.out.println(max[x]);
		}
	}
}
}
