package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        boolean add;
        for(int a : asteroids){
            add = true;
            while(!st.isEmpty() && st.peek() > 0 && a < 0){
                if(st.peek() < -a){
                    st.pop();
                }else if(st.peek() == -a){
                    st.pop();
                    add = false;
                    break;
                }else{
                    add = false;
                    break;
                }
            }
            if(add)
                st.push(a);
        }
        int[] ans = new int[st.size()];
        for(int s : st){
            ans[i++] = s;
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
        int[] ans = asteroidCollision(nums);
        for(int x : ans)
            System.out.print(x+",");
    }
}
