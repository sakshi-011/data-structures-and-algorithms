package Leetcode.OneToThousand.OneHundredToTwoHundred;

public class MinStack {

    int[] stack;
    int top;
    int[] min;

    public MinStack() {
        stack = new int[30000];
        top = -1;
        min = new int[30000];
    }

    public void push(int val) {
        stack[++top] = val;
        int m = top == 0 ? val : Math.min(min[top-1],val);
        min[top] = m;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return min[top];
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }

}
