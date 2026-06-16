package Leetcode.ThreeThousandToFourThousand.SixHundredToSevenHundred;

public class ProcessStringWithSpecialOperations1 {

    public static String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            switch(c){
                case '*' : if(sb.length() > 0)
                                sb.deleteCharAt(sb.length() - 1);
                        break;
                case '#' : sb.append(sb.toString());
                    break;
                case '%' : sb.reverse();
                    break;
                default : sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("a#b%* : " + processStr("a#b%*"));
        System.out.println("z*# : " + processStr("z*#"));
    }
}
