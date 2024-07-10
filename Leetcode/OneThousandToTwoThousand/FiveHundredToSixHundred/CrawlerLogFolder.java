package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

import java.util.Scanner;

public class CrawlerLogFolder {

    public static int minOperations(String[] logs) {
        int count = 0;
        for(String folder : logs){
            if(folder.equals("../")) {
                if(count == 0)
                    continue;
                count--;
            }
            else if(!folder.equals("./"))
                count++;
        }
        return Math.max(0,count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] logs = s.replace("\\[\"","").replace("\"]","").split("\",\"");
        System.out.println(minOperations(logs));
    }
}
