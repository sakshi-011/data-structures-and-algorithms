package Leetcode;

import java.util.Scanner;

public class DesignCircularQueue {

    private int[] queue;
    int front=0, rear=-1, len=0;

    public DesignCircularQueue(int k) {
        queue = new int[k];
    }

    public boolean enQueue(int value) {
        if(len != queue.length)
        {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            len++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if(len != 0)
        {
            front = (front + 1) % queue.length;
            len--;
            return true;
        }
        return false;
    }

    public int Front() {
        if(len==0) return -1;
        return queue[front];
    }

    public int Rear() {
        if(len==0) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        if(len==0) return true;
        else return false;
    }

    public boolean isFull() {
        if(len==queue.length) return true;
        else return false;
    }

}
