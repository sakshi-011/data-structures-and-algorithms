package Leetcode.ThreeThousandToFourThousand.NineHundredToThousand;

public class MinimumOperationsToTransformBinaryString {

    public static int minOperations(String s1, String s2) {

        if(s1.equals("1") && s2.equals("0"))
            return -1;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int n = c1.length, count = 0, costNext = 0, costPrev = 0;

        for(int i = 0; i < n; i++){
            costNext = 10;
            costPrev = 10;
            if(c1[i] == c2[i])
                continue;
            if(c1[i] == '0' && c2[i] == '1')
                count++;
            if(c1[i] == '1' && c2[i] == '0'){
                if(i < n-1){
                    if(c1[i+1] == '1' && c2[i+1] == '0'){
                        costNext = 1;
                    } else if(c1[i+1] == '1' && c2[i+1] == '1'){
                        costNext = 2;
                    } else if(c1[i+1] == '0' && c2[i+1] == '0'){
                        costNext = 2;
                    } else if(c1[i+1] == '0' && c2[i+1] == '1'){
                        costNext = 3;
                    }
                }
                if(i > 0) {
                    costPrev = 2;
                }
                if(costNext <= costPrev){
                    count += costNext;
                    i++;
                } else {
                    count += costPrev;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations("11","00"));
        System.out.println(minOperations("01","10"));
        System.out.println(minOperations("1","0"));
    }
}
