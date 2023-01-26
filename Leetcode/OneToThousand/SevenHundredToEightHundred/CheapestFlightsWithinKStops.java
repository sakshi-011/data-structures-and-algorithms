package Leetcode.OneToThousand.SevenHundredToEightHundred;

import java.util.Scanner;
import java.util.Arrays;

public class CheapestFlightsWithinKStops {

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(dist,n);
            for(int[] arr : flights ){
                if(dist[arr[0]] != Integer.MAX_VALUE){
                    temp[arr[1]] = Math.min(temp[arr[1]],dist[arr[0]]+arr[2]);
                }
            }
            dist = temp;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = in.nextInt();
        int dst = in.nextInt();
        int k = in.nextInt();

        System.out.println(findCheapestPrice(n,flights,src,dst,k));
    }
}
