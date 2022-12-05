package Search;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int left = 0, right=nums.length-1,mid=0;
        while(right>=left){
            mid=(right+left)/2;
            if(nums[mid]==target) {
                return mid;
            } else if(nums[mid]>target){
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int target = in.nextInt();
        System.out.println(binarySearch(nums, target));
    }

}
