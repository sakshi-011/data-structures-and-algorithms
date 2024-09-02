package Leetcode.OneThousandToTwoThousand.EightHundredToNineHundred;

import java.util.Scanner;

public class FindTheStudentThatWillReplaceTheChalk {

    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        int n = chalk.length;

        for (int i = 0; i < n; i++) {
            sum += chalk[i];
            if (sum > k) {
                break;
            }
        }

        k = k % (int) sum;
        for(int i = 0; i < n; i++){
            if(chalk[i] > k)
                return i;
            k = k - chalk[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int k = in.nextInt();
        System.out.println(chalkReplacer(nums,k));
    }
}
