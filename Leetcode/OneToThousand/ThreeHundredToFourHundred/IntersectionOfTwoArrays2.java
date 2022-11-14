package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.ArrayList;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i;
        int m = in.nextInt();
        int[] nums1 = new int[m];
        for(i=0;i<m;i++)
            nums1[i] = in.nextInt();
        int n = in.nextInt();
        int[] nums2 = new int[n];
        for(i=0;i<n;i++)
            nums2[i] = in.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(i=0;i<m;i++){
            arr.add(nums1[i]);
        }
        for(i=0;i<n;i++){
            if(arr.contains(nums2[i])){
                temp.add(nums2[i]);
                arr.remove(Integer.valueOf(nums2[i]));
            }
        }
        
        int[] ans = new int[temp.size()];
        for(i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
            System.out.println(ans[i]);
        }
    }
}
