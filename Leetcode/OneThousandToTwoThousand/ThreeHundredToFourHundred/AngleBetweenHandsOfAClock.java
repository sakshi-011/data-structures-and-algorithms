package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

public class AngleBetweenHandsOfAClock {

    public static double angleClock(int hour, int minutes) {
        double minAngle = minutes * 6;
        double hourAngle =  (hour % 12) * 30 + minutes * 0.5;
        double diff = Math.abs(hourAngle - minAngle);
        return Math.min(diff, 360 - diff);
    }

    public static void main(String[] args) {
        System.out.println(angleClock(12, 30));
        System.out.println(angleClock(3, 15));
        System.out.println(angleClock(5, 41));
    }
}
