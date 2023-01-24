package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums.length, max = 0, ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.merge(nums[i],1,Integer::sum);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }

    /*
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        System.out.println(majorityElement(nums));
    }

}
