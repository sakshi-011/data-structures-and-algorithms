package Leetcode.OneThousandToTwoThousand.SixHundredToSevenHundred;

import java.util.Scanner;

public class NumberOfStudentsUnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        int zeroCount = 0;
        for(int x : students){
            if(x == 0)
                zeroCount++;
        }
        int oneCount = students.length - zeroCount;
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeroCount == 0)
                    break;
                zeroCount--;
            } else if (sandwich == 1) {
                if (oneCount == 0)
                    break;
                oneCount--;
            }
        }
        return zeroCount + oneCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] students = new int[st.length];
        for(int i = 0; i < st.length; i++){
            students[i] = Integer.valueOf(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] sandwiches = new int[st.length];
        for(int i = 0; i < st.length; i++){
            sandwiches[i] = Integer.valueOf(st[i]);
        }
        System.out.println(countStudents(students,sandwiches));
    }
}
