package Leetcode.TwoThousandToThreeThousand.ThreeHundredToFourHundred;

import java.util.Scanner;
import java.util.Arrays;
import Leetcode.ListNode;

public class SpiralMatrix4 {

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int[] arr : matrix)
            Arrays.fill(arr,-1);
        int i = 0, j = 0;
        int[] limit = {0, m-1, 0, n-1};
        char direction = 'r';
        while(head != null){
            switch (direction) {
                case 'r' -> {
                    i = limit[0];
                    for(j = limit[2]; j <= limit[3] && head != null; j++){
                        matrix[i][j] = head.val;
                        head = head.next;
                    }
                    direction = 'd';
                    limit[0]++;
                }
                case 'l' -> {
                    i = limit[1];
                    for(j = limit[3]; j >= limit[2] && head != null; j--){
                        matrix[i][j] = head.val;
                        head = head.next;
                    }
                    direction = 'u';
                    limit[1]--;

                }
                case 'd' -> {
                    j = limit[3];
                    for(i = limit[0]; i <= limit[1] && head != null; i++){
                        matrix[i][j] = head.val;
                        head = head.next;
                    }
                    direction = 'l';
                    limit[3]--;
                }
                case 'u' -> {
                    j = limit[2];
                    for(i = limit[1]; i >= limit[0] && head != null; i--){
                        matrix[i][j] = head.val;
                        head = head.next;
                    }
                    direction = 'r';
                    limit[2]++;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        ListNode head = new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(6))));
        ListNode temp = head.next.next.next;
        temp.next = new ListNode(8, new ListNode(1, new ListNode(7, new ListNode(9, new ListNode(4)))));
        temp = temp.next.next.next.next.next;
        temp.next = new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(0))));
        int[][] matrix = spiralMatrix(m,n,head);
        for(int[] arr : matrix) {
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        }
//        temp = head;
//        while(temp!= null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
    }
}
