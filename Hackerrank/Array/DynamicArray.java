package Hackerrank.Array;

import java.util.Scanner;
import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args){
	int lastAnswer = 0;

	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int q = in.nextInt();
	int i, idx;
	
	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for (i = 0; i < n; i++) {
        arr.add(new ArrayList<Integer>());
    }
	
	for(i=0;i<q;i++){
		int a = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		idx = (x^lastAnswer)%n;

		if(a == 1){
			 arr.get(idx).add(y);
		}
		else{
			lastAnswer = arr.get(idx).get(y%arr.get(idx).size());
			System.out.println(lastAnswer);
		}
	}
}
}
