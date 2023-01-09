package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class SquareRoot {

    public static int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int l = 1, r = x, mid, ans = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(mid <= x/mid){
                ans = mid;
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(mySqrt(x));
    }

}
