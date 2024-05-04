package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;
import java.util.Arrays;

public class BoatsToSavePeople {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, left = 0, right = people.length-1;
        while(left <= right){
            System.out.println("left - "+left+" right - "+right);
            if(people[left]+people[right] <= limit){
                left++;
            }
            right--;
            count++;
            System.out.println("count -"+count);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int limit = in.nextInt();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] people = new int[st.length];
        for(int i = 0; i < st.length; i++){
            people[i] = Integer.parseInt(st[i]);
        }
        System.out.println(numRescueBoats(people,limit));
    }
}
