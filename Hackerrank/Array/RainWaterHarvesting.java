package Hackerrank.Array;

import java.util.*;


public class RainWaterHarvesting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(),i,x,result=0;
        int[] arr = new int[n];
        int[] left_max = new int[n];
        int[] right_max = new int[n];
        
        for(i=0;i<n;i++){
            x = in.nextInt();
            arr[i] = x;
        }
        
        left_max[0]=arr[0];
        
        for(i=1;i<n;i++){
            left_max[i] = Math.max(left_max[i-1], arr[i]);
        }
        
        right_max[n-1]=arr[n-1];
        
        for(i=n-2;i>=0;i--){
            right_max[i] = Math.max(right_max[i+1], arr[i]);
        }
        
        for(i=0;i<n;i++){
            result += Math.min(left_max[i], right_max[i])-arr[i];
        }
        
        System.out.println(result);
    }
}
