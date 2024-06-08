package Leetcode.ThreeThousandToFourThousand.OneHundredToTwoHundred;

import java.util.Scanner;

public class FindTheFirstPlayerToWinKGamesInARow {

    public static int findWinningPlayer(int[] skills, int k) {
        int ans = 0, max = 0, n = skills.length, count = 0;
        if(k > n){
            for(int i = 0; i < n; i++)
                if(skills[i] > max) {
                    max = skills[i];
                    ans = i;
                }
            return ans;
        }
        int curr = skills[0];
        for(int i = 1; i < n; i++){
            if(curr > skills[i]){
                count++;
            } else {
                count = 1;
                curr = skills[i];
                ans = i;
            }
            if(count == k)
                return ans;
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
        int k = in.nextInt();
        System.out.println(findWinningPlayer(nums,k));
    }
}
