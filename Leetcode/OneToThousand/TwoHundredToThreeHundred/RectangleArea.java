package Leetcode.OneToThousand.TwoHundredToThreeHundred;
public class RectangleArea {

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = 0, area2 = 0, common = 0;
        area1 = Math.abs(ax2-ax1) * Math.abs(ay2-ay1);
        area2 = Math.abs(bx2-bx1) * Math.abs(by2-by1);
        int left = Math.max(ax1,bx1), right = Math.min(ax2,bx2);
        int bottom = Math.max(ay1,by1), top = Math.min(ay2,by2);
        if(right > left && top > bottom)
            common = (right - left) * (top - bottom);
        return area1 + area2 - common;
    }

    public static void main(String[] args) {
        int area = computeArea(-3,0,3,4,0, -1,9,2);
        System.out.println(area);
    }
}
