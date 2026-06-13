package Leetcode.ThreeThousandToFourThousand.EightHundredToNineHundred;

public class WeightedWordMapping {

    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String w : words){
            int sum = 0;
            for(char c : w.toCharArray()){
                sum = (sum + weights[c-'a']) % 26;
            }
            System.out.println("sum " + sum);
            ans.append((char) (122 - sum));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "abcd";
        words[1] = "def";
        words[2] = "xyz";
        mapWordWeights(words,new int[]{5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2});
    }
}
