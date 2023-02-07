package Sort;

import java.util.Scanner;

public class InsertionSort {

    public  static int[] insertionSort(int[] nums){
        int n = nums.length, j, temp;
        for (int i = 1; i < n; i++) {
            temp = nums[i];
            j = i - 1;
            while(j >= 0 && temp < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
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
        int[] ans = insertionSort(nums);
        for(int x : ans)
            System.out.print(x+",");
    }

}
