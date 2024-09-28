package Leetcode.OneToThousand.SixHundredToSevenHundred;

class Deque{
    int val;
    Deque prev;
    Deque next;
    Deque(int val, Deque prev, Deque next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
class MyCircularDeque {

    Deque head;
    Deque tail;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if(isFull())
            return false;
        if(head == null){
            head = new Deque(value, null, null);
            tail = head;
        } else {
            Deque node = new Deque(value, null, head);
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull())
            return false;
        if(head == null){
            head = new Deque(value, null, null);
            tail = head;
        } else {
            tail.next = new Deque(value, tail, null);
            tail = tail.next;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty())
            return false;
        if(size == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty())
            return false;
        if(size == 1){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
        }
        size--;
        return true;
    }

    public int getFront() {
        if(isEmpty())
            return -1;
        return head.val;
    }

    public int getRear() {
        if(isEmpty())
            return -1;
        return tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class DesignCircularDeque {

    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1));
        System.out.println(myCircularDeque.insertLast(2));
        System.out.println(myCircularDeque.insertFront(3));
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getRear());
        System.out.println(myCircularDeque.isFull());
        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getFront());
    }
}
