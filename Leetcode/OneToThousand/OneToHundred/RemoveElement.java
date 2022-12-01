package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        int val = in.nextInt();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[count++] = nums[i];
            }
        }
        for(int x : nums){
            System.out.print(x+" ");
        }
    }

}
