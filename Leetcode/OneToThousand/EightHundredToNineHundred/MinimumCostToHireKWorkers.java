package Leetcode.OneToThousand.EightHundredToNineHundred;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import javafx.util.Pair;
import java.util.Comparator;
import java.util.PriorityQueue;


public class MinimumCostToHireKWorkers {

    public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double totalCost = Double.MAX_VALUE;
        double currentTotalQuality = 0;
        List<Pair<Double, Integer>> wageToQualityRatio = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            wageToQualityRatio.add(
                    new Pair<>((double) wage[i] / quality[i], quality[i]));
        }

        Collections.sort(wageToQualityRatio,
                Comparator.comparingDouble(Pair::getKey));

        PriorityQueue<Integer> highestQualityWorkers = new PriorityQueue<>(
                Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            highestQualityWorkers.add(wageToQualityRatio.get(i).getValue());
            currentTotalQuality += wageToQualityRatio.get(i).getValue();

            if (highestQualityWorkers.size() > k) {
                currentTotalQuality -= highestQualityWorkers.poll();
            }

            if (highestQualityWorkers.size() == k) {
                totalCost = Math.min(totalCost, currentTotalQuality *
                        wageToQualityRatio.get(i).getKey());
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] quality = new int[st.length];
        for(int i = 0; i < st.length; i++){
            quality[i] = Integer.parseInt(st[i]);
        }
        s = in.next();
        st = s.replaceAll("\\[","").replaceAll("]","").split(",");
        int[] wage = new int[st.length];
        for(int i = 0; i < st.length; i++){
            wage[i] = Integer.parseInt(st[i]);
        }
        int k = in.nextInt();
        System.out.println(mincostToHireWorkers(quality,wage,k));
    }

}
