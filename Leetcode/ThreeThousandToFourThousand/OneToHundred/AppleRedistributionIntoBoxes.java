package Leetcode.ThreeThousandToFourThousand.OneToHundred;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class AppleRedistributionIntoBoxes {

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) {
            sum += a;
        }
        Integer[] cap = Arrays.stream(capacity)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(cap, Collections.reverseOrder());

        int box = 0;
        while (sum > 0) {
            sum -= cap[box];
            box += 1;
        }
        return box;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] apple = new int[st.length];
        for(int i = 0; i < st.length; i++){
            apple[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] cap = new int[st.length];
        for(int i = 0; i < st.length; i++){
            cap[i] = Integer.parseInt(st[i]);
        }
        System.out.println(minimumBoxes(apple, cap));
    }
}
