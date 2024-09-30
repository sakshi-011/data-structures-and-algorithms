package Leetcode.OneThousandToTwoThousand.ThreeHundredToFourHundred;

class Node{
    int val;
    Node prev;
    Node next;

    public Node(){}

    public Node(int val, Node prev, Node next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class CustomStack {

    Node head;
    Node tail;
    int size;
    int capacity;

    public CustomStack(int maxSize) {
        capacity = maxSize;
        size = 0;
    }

    public void push(int x) {
        if(size >= capacity)
            return;
        if(size == 0) {
            head = new Node(x, null, null);
            tail = head;
        } else {
            tail.next = new Node(x, tail, null);
            tail = tail.next;
        }
        size++;
        //System.out.println("size "+size+" push "+x+" head "+head.val+" tail "+tail.val);
    }

    public int pop() {
        int value = -1;
        if(size == 0)
            return value;
        value = tail.val;
        if(size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
        }
        size--;
        //System.out.println("size "+size+" pop "+" head "+head.val+" tail "+tail.val);
        return value;
    }

    public void increment(int k, int val) {
        Node temp = head;
        for(int i = 0; i < Math.min(k,size); i++){
            temp.val = temp.val + val;
            temp = temp.next;
        }
    }
}

public class DesignAStackWithIncrementOperation {

    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3);
        stk.push(1);
        stk.push(2);
        System.out.println(stk.pop());
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.increment(5, 100);
        stk.increment(2, 100);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
