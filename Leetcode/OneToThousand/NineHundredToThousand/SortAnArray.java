package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Scanner;

public class SortAnArray {

    public static void merge(int[] nums, int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = nums[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = nums[m+1+i];
        }
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                nums[k] = left[i++];
            }else{
                nums[k] = right[j++];
            }
            k++;
        }
        while(i<n1)
            nums[k++] = left[i++];
        while(j<n2)
            nums[k++] = right[j++];
    }

    public static void mergeSort(int[] nums, int l, int r){
        if(l<r) {
            int m = l + (r-l) / 2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int[] sortedArray = sortArray(nums);
        for(int x : sortedArray)
            System.out.print(x+" ");
    }

}
