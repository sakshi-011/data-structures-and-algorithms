package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        int val=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(val!=nums[i]){
                val=nums[i];
                nums[count++]=nums[i];
            }
        }
        for(int x : nums)
            System.out.print(x+" ");
    }

}
