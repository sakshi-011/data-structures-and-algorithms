package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning {

    public static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    public static void dfs(String s, int start, List<List<String>> list, List<String> currList){
        if(start >= s.length())
            list.add(new ArrayList<String>(currList));
        for (int end = start; end < s.length(); end++) {
            if(isPalindrome(s,start,end)){
                currList.add(s.substring(start,end+1));
                dfs(s,end+1,list,currList);
                currList.remove(currList.size()-1);
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        dfs(s,0,list,new ArrayList<String>());
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        List<List<String>> ans = partition(s);
        for(List<String> l : ans){
            System.out.println(l.toString());
        }
    }

}
