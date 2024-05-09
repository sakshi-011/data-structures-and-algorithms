package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximizeHappinessOfSelectedChildren {

    public static long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : happiness){
            q.offer(x);
        }
        int i = 1;
        while(!q.isEmpty()){
            if(i > k)
                break;
            ans += Math.max(q.poll() + 1 - i++, 0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        System.out.println(maximumHappinessSum(nums,k));
    }
}
