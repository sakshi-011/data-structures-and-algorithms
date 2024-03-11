package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CustomSortString {

    public static String customSortString(String order, String s) {
        int len = s.length(), count = 0;
        String ans = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            map.merge(s.charAt(i),1,Integer::sum);
        }
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            count = map.getOrDefault(c,-1);
            if(count >= 1)
                map.remove(c);
            while(count >= 1){
                ans += c;
                count--;
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            count = entry.getValue();
            while(count >= 1){
                ans += c;
                count--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order = in.next();
        String s = in.next();
        System.out.println(customSortString(order,s));
    }
}
