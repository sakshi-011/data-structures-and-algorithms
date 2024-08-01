package Leetcode.TwoThousandToThreeThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class NumberOfSeniorCitizens {

    public static int countSeniors(String[] details) {
        int count = 0, age;
        for(String s : details){
            age = (s.charAt(11) - '0') * 10 + (s.charAt(12) - '0');
            if(age > 60)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] details = s.replaceAll("\\[","").replaceAll("]","").split("\",\"");
        System.out.println(countSeniors(details));
    }
}
