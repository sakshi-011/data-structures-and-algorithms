package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Stack;

public class AddToArrayFormOfInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = num.length-1, sum = 0, carry = 0;
        while(k>0 || n>=0){
            if(n>=0)
                k += num[n--];
            stack.push(k % 10);
            k /= 10;
        }
        List<Integer> l = new ArrayList<>();
        while(!stack.isEmpty())
            l.add(stack.pop());
        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").replaceAll("]", "").split(",");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        int k = in.nextInt();
        List<Integer> ans = addToArrayForm(nums,k);
        System.out.println(ans.toString());
    }
}
