package Sort;

import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] nums){
        int n = nums.length;
        if(n <= 1)
            return nums;
        int temp, min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
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
        int[] ans = selectionSort(nums);
        for(int x : ans)
            System.out.print(x+",");
    }

}
