package Leetcode.OneToHundred;

import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int ans = 0, cur = 0;
        int i=0,j=height.length-1;
        while(i<j){
            cur = Math.min(height[i],height[j]) * (j-i);
            if(cur>ans) {
                ans = cur;
            }
            if(height[i] < height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = in.nextInt();
        }
        int x = maxArea(height);
        System.out.println(x);
    }

}
