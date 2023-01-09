package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int n = height.length, max, ans = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        max = height[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max,height[i]);
            left[i] = max;
        }
        max = height[n-1];
        for (int i = n-1; i >= 0; i--) {
            max = Math.max(max,height[i]);
            right[i] = max;
        }
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] height = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            height[i] = Integer.parseInt(str[i]);
        }
        System.out.println(trap(height));
    }

}
