package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Scanner;

public class GuessNumberHigherOrLower {

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    public static int guess(int num){
        return 0;
    }

    /* Ternary Search
        public int guessNumber(int n) {
            int low = 1;
            int high = n;
            while (low <= high) {
                int mid1 = low + (high - low) / 3;
                int mid2 = high - (high - low) / 3;
                int res1 = guess(mid1);
                int res2 = guess(mid2);
                if (res1 == 0)
                    return mid1;
                if (res2 == 0)
                    return mid2;
                else if (res1 < 0)
                    high = mid1 - 1;
                else if (res2 > 0)
                    low = mid2 + 1;
                else {
                    low = mid1 + 1;
                    high = mid2 - 1;
                }
            }
            return -1;
        }
     */

    public static int guessNumber(int n) {
        int l=1, r=n, mid;
        while(l<=r){
            mid = (l+r)/2;
            int ans = guess(mid);
            if(ans == 0)
                return mid;
            else if(ans == -1)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(guessNumber(n));
    }

}
