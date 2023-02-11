package Leetcode.OneToThousand.TwoHundredToThreeHundred;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 1)
            return true;
        Map<Integer,List<Integer>> adj = new HashMap<>();
        int[] degree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for (int[] e : prerequisites) {
            adj.computeIfAbsent(e[1],val -> new ArrayList<>()).add(e[0]);
            degree[e[0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if(degree[i] == 0)
                q.offer(i);
        }
        while(!q.isEmpty()){
            int course = q.poll();
            count++;
            if(!adj.containsKey(course))
                continue;
            for(Integer n : adj.get(course)){
                if(--degree[n] == 0)
                    q.offer(n);
            }
        }
        return count == numCourses;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String[] str = s.replaceAll("\\[", "").split("],");
        int[][] prerequisites = new int[str.length][2];
        for (int i = 0; i < str.length; i++) {
            String[] st = str[i].replaceAll("]", "").split(",");
            prerequisites[i][0] = Integer.valueOf(st[0]);
            prerequisites[i][1] = Integer.valueOf(st[1]);
        }
        System.out.println(canFinish(n,prerequisites));
    }

}
