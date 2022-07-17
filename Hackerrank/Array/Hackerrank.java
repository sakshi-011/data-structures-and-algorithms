package Hackerrank.Array;

import java.util.*;

public class Hackerrank {

    public static void main(String[] args) {
        int n=4000, s=3000, val;
        List<List<Integer>> queries = new ArrayList<>();
        Scanner in = new Scanner(System.in);
       
        for(int i=0;i<s;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<3;j++){
                val = in.nextInt();
                list.add(j,val);
            }
            queries.add(i,list);
        }
        
        int[] a = new int[n];
        
        for(int i=0; i<queries.size(); i++){
            a[queries.get(i).get(0)-1]+=queries.get(i).get(2);
            if(queries.get(i).get(1) != n)
                a[queries.get(i).get(1)]-=queries.get(i).get(2);
        }
        
        int sum = 0,max=0;
        for(int i=0;i<n;i++){
          sum += a[i];
          if(sum>max)
            max = sum;
        }
        
        System.out.println("The max value is - "+max);

    }
    
}
