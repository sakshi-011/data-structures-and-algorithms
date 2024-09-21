package Leetcode.TwoThousandToThreeThousand.FiveHundredToSixHundred;

import java.util.ArrayList;
import java.util.List;
import java.util.BitSet;

public class HandlingSumQueriesAfterUpdate {

    public static long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        int idx = 0, n = nums1.length;
        long sum = 0, count1 = 0, count0 = 0;
        BitSet bs = new BitSet(n);
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] == 1)
                bs.set(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            sum += nums2[i];
        }
        List<Long> l = new ArrayList<>();
        for(int[] q : queries){
            if(q[0] == 1){
                bs.flip(q[1],q[2] + 1);
            }
            else if(q[0] == 2){
                sum += 1L * q[1] * bs.cardinality();
            }else{
                l.add(sum);
            }
        }
        long[] ans = new long[l.size()];
        for(Long a : l)
            ans[idx++] = a;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,0,0,0,1,0,1,1,1};
        int[] nums2 = {35,29,21,34,8,48,22,43,37};
        int[][] queries = {{1,4,7},{3,0,0},{2,27,0},{3,0,0},{1,0,3},{3,0,0},{2,6,0},{1,3,8},{2,13,0},{3,0,0}};
        long[] ans = handleQuery(nums1,nums2,queries);
        for(long l : ans)
            System.out.println(l);
    }

}
