package Leetcode.OneToThousand.NineHundredToThousand;

import java.util.Queue;
import java.util.LinkedList;

public class NumberOfRecentCalls {

    static class RecentCounter {

        Queue<Integer> records;

        public RecentCounter() {
            records = new LinkedList<>();
        }

        public int ping(int t) {
            records.offer(t);
            while(records.peek() < t - 3000)
                records.poll();
            return records.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter r = new RecentCounter();
        System.out.println(r.ping(1));
        System.out.println(r.ping(1000));
        System.out.println(r.ping(3001));
        System.out.println(r.ping(3002));
        System.out.println(r.ping(9002));
    }
}
