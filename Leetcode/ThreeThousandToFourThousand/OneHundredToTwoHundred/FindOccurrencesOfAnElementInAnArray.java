package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurrencesOfAnElementInAnArray {

    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int idx = 1;
        int[] ans = new int[queries.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                map.put(idx++,i);
            }
        }
        for(int i = 0; i < queries.length; i++){
            ans[i] = map.getOrDefault(queries[i],-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] q = new int[st.length];
        for(int i = 0; i < st.length; i++){
            q[i] = Integer.parseInt(st[i]);
        }
        int x = in.nextInt();
        int[] ans = occurrencesOfElement(nums,q,x);
        for(int a : ans)
            System.out.print(a+" ");
    }
}
