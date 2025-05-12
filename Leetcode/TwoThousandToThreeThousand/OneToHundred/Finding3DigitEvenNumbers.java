package Leetcode.TwoThousandToThreeThousand.OneToHundred;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Finding3DigitEvenNumbers {

    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> nums = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num >= 100 && num % 2 == 0) {
                        nums.add(num);
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>(nums);
        Collections.sort(res);
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] nums = new int[st.length];
        for(int i = 0; i < st.length; i++){
            nums[i] = Integer.parseInt(st[i]);
        }

        int[] ans = findEvenNumbers(nums);
        for(int i : ans)
            System.out.print(i+" ");
    }
}
