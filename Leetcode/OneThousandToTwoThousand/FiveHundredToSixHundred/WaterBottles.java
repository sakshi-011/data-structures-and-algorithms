package Leetcode.OneThousandToTwoThousand.FiveHundredToSixHundred;

public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int n = numBottles, y = numExchange, sum = n;
        while(n >= y){
            sum += n/y;
            n = n/y + n%y;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
        System.out.println(numWaterBottles(15,4));
    }
}
