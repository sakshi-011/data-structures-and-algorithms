package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = x%10, max=Integer.MAX_VALUE, min=Integer.MIN_VALUE;
        x = x/10;
        while(x!=0){
            if((rev > max/10) || ((rev == max/10) && (x%10 > 7)))
                return 0;
            else if((rev < min/10) || ((rev == min/10) && (x%10 < -8)))
                return 0;
            else
                rev = rev*10+ x%10;
            x = x/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(reverse(x));
    }
}
