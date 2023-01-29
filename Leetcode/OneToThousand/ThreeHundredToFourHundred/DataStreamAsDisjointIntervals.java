package Leetcode.OneToThousand.ThreeHundredToFourHundred;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

class SummaryRanges {

    private Set<Integer> values;

    public SummaryRanges() {
        values = new TreeSet<>();
    }

    public void addNum(int value) {
        values.add(value);
    }

    public int[][] getIntervals() {
        if (values.isEmpty()) {
            return new int[0][2];
        }
        List<int[]> intervals = new ArrayList<>();
        int left = -1, right = -1;
        for (Integer value : values) {
            if (left < 0) {
                left = right = value;
            } else if (value == right + 1) {
                right = value;
            } else {
                intervals.add(new int[] {left, right});
                left = right = value;
            }
        }
        intervals.add(new int[] {left, right});
        return intervals.toArray(new int[0][]);
    }
}
public class DataStreamAsDisjointIntervals {

    public static void main(String[] args) {
        SummaryRanges s = new SummaryRanges();
        s.addNum(1);
        int[][] arr = s.getIntervals();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+","+arr[i][1]);
        }
        s.addNum(3);
        s.addNum(7);
        arr = s.getIntervals();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+","+arr[i][1]);
        }
        s.addNum(2);
        s.addNum(6);
        arr = s.getIntervals();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+","+arr[i][1]);
        }
    }

}
