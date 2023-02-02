package TechGig;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
You and your friend go to a game arcade where you choose to play the game Lucky Pick.
In the game, there is a square grid and on each block, some money is placed on it.
When a player chooses a block, the machine randomly chooses a block from the neighboring ones and the chosen block (consider 8 neighborhood).
The player is awarded the money that is placed on the block that the machine selects. Your friend needs help choosing the block.

Your job is to return the block position(s) that will maximize the minimum amount your friend will win for sure.
If there are more than one such block positions then the output must return for all these positions.

Input Format
You will be given the Grid Description as -
The first line consists of the size of the square grid (N)
The next N lines each containing N numbers separated by '#', each number representing the amount of money put on that block


Constraints
1 < N < 500

Output Format
You need to print the array of string containing the position(s) of a block choosing which will give the maximum amount of money which your friend will definitely win.
 */

public class CandidateCode {

    public static List<String> gameCenter(int[][] grid){
        List<String> ans = new ArrayList<>();
        int n = grid.length;
        if(n == 1){
            ans.add("1#1");
            return ans;
        }
        int[][] dp = new int[n][n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int start1 = i==0 ? 0 : i-1;
                int end1 = i==n-1 ? n-1 : i+1;
                int start2 = j==0 ? 0 : j-1;
                int end2 = j==n-1 ? n-1 : j+1;
                int min = Integer.MAX_VALUE;
                for (int k = start1; k <= end1; k++) {
                    for (int l = start2; l <= end2; l++) {
                        min = Math.min(min,grid[k][l]);
                    }
                }
                dp[i][j] = min;
                max = Math.max(max,dp[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(dp[i][j] == max)
                    ans.add((i+1)+"#"+(j+1));
            }
        }
        return ans;
    }

    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = in.next();
            String[] str = s.split("#");
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(str[j]);
            }
        }
        List<String> ans = gameCenter(grid);
        for(String t : ans){
            System.out.println(t);
        }
    }

}