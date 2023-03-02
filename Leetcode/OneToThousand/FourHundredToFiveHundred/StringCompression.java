package Leetcode.OneToThousand.FourHundredToFiveHundred;

import java.util.Scanner;

public class StringCompression {

    public static int compress(char[] chars) {
        int index = 0, count = 1;
        char prev = chars[0];
        for(int i = 1; i< chars.length; i++){
            if(chars[i] != prev){
                chars[index++] = prev;
                if(count > 1){
                    String st = count+"";
                    for(int k = 0; k < st.length(); k++) {
                        chars[index++] = st.charAt(k);
                    }
                }
                count = 1;
                prev = chars[i];
            } else{
              count++;
            }
        }
        if(count > 1){
            chars[index++] = prev;
            String st = count+"";
            for(int k = 0; k < st.length(); k++) {
                chars[index++] = st.charAt(k);
            }
        } else{
            chars[index++] = prev;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").replaceAll("\"","").split(",");
        char[] chars = new char[st.length];
        int i = 0;
        for(String t : st)
            chars[i++] = t.charAt(0);
        System.out.println(compress(chars));
    }

}
