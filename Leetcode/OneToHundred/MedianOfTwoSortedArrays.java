package Leetcode.OneToHundred;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int p1=0, p2=0, k=0, l=nums1.length+nums2.length;
        int[] ar = new int[l];
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<=nums2[p2])
                ar[k++]=nums1[p1++];
            else
                ar[k++]=nums2[p2++];
        }
        while(p1<nums1.length)
            ar[k++]=nums1[p1++];
        while(p2<nums2.length)
            ar[k++]=nums2[p2++];

        ans = l%2 == 0 ? ((ar[l/2-1]+ar[l/2])/2.0000) : (ar[(l-1)/2]);
        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int[] nums1 = new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] nums2 = new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i] = in.nextInt();
        }
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println("Median : "+ans);
    }
}
