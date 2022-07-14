package Leetcode;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] nums = new int[n];
        Set<Integer> st = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            int x = in.nextInt();
            if(!st.contains(x))
                st.add(x);
            else
                System.out.println(true);
        }
        System.out.println(false);
    }
}
