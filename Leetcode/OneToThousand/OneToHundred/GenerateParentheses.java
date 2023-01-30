package Leetcode.OneToThousand.OneToHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {

    public static void generate(List<String> ans, StringBuilder cur, int left, int right, int n){
        if(cur.length() == 2*n){
            ans.add(cur.toString());
            return;
        }
        if(left < n){
            cur.append('(');
            generate(ans,cur,left+1,right,n);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(right < left){
            cur.append(')');
            generate(ans,cur,left,right+1,n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(generateParenthesis(n).toString());
    }

}
