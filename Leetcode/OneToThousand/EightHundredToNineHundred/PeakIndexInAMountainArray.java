package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class PeakIndexInAMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length-1, mid, n = arr.length-1;
        while(r>=l){
            mid = (l+r)/2;
            if(mid == n || mid == 0) return mid;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if(arr[mid] < arr[mid-1]){
                r = mid;
            }else{
                l = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        System.out.println(peakIndexInMountainArray(arr));
    }

}
