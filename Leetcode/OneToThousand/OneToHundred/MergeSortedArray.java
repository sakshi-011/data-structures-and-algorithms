package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = nums1.length - 1;
        m = m-1;
        n = n-1;
        while(m != -1 && n != -1){
            if(nums1[m] > nums2[n]){
                nums1[pointer] = nums1[m];
                pointer--;
                m--;
            }
            else{
                nums1[pointer] = nums2[n];
                pointer--;
                n--;
            }
        }

        while(n != -1){
            nums1[pointer] = nums2[n];
            pointer--;
            n--;
        }
        if(m==0)
            for(int i=0;i<n;i++)
                nums1[i]=nums2[i];
    }

}
