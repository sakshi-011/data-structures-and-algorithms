package Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LargestRectangle {

    public static long largestRectangle(List<Integer> h) {
        long res = 0,area;
        int i,n=h.size();
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> s = new Stack<Integer>();

        //finding left limit
        for(i=0;i<n;i++){
            while(!s.empty() && h.get(s.peek()) >= h.get(i)){
                s.pop();
            }
            if(s.empty()){
                left[i]=0;
            }
            if(!s.empty() && h.get(s.peek()) < h.get(i)){
                left[i] = s.peek() + 1;
            }
            s.push(i);
        }

        //finding right limit
        s.clear();
        for(i=n-1;i>=0;i--){
            while(!s.empty() && h.get(s.peek()) >= h.get(i)){
                s.pop();
            }
            if(s.empty()){
                right[i] = n-1;
            }
            if(!s.empty() && h.get(s.peek()) < h.get(i)){
                right[i] = s.peek() - 1;
            }
            s.push(i);
        }

        for(i=0;i<n;i++){
            area = (right[i] - left[i] + 1) * h.get(i);
            if(res < area)
                res = area;
        }

        return res;
    }

     /* O(n2) COMPLEXITY
    public static long largestRectangle(List<Integer> h) {
        long res =0;
        int n,m,i,j,lastIndex = h.size()-1;
        long[][] arr = new long[h.size()][3];

        for(i=0;i<=lastIndex;i++){
            j=i-1;
            arr[i][0]++;
            n = h.get(i);
            while(j>=0){
                m = h.get(j);
                if(n < m && arr[j][2]!=1){
                    arr[j][2] = 1;
                }
                if(n >= m && arr[j][2]!=1){
                    arr[j][0]++;
                }
                if(n > m && arr[i][1]!=1){
                    arr[i][1] = 1;
                }
                if(n <= m && arr[i][1]!=1){
                    arr[i][0]++;
                }
                j--;
            }
        }

        for(i=0;i<=lastIndex;i++){
            arr[i][0] *= h.get(i);
            if(res < arr[i][0])
                res = arr[i][0];
        }

        return res;
    }
    */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> h = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            h.add(i, x);
        }
        
        long r = largestRectangle(h);
        System.out.println(r);
    }
}
