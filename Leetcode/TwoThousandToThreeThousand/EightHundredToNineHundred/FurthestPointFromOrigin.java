package Leetcode.TwoThousandToThreeThousand.EightHundredToNineHundred;

public class FurthestPointFromOrigin {

    public static int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, d = 0;
        for (char c : moves.toCharArray()) {
            if(c == 'L') {
                l++;
            } else if(c == 'R'){
                r++;
            } else{
                d++;
            }
        }
        return Math.abs(l-r) + d;
    }

    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("L_RL__R"));
        System.out.println(furthestDistanceFromOrigin("_R__LL_"));
        System.out.println(furthestDistanceFromOrigin("__________"));
    }
}
