package Leetcode.OneToThousand.OneHundredToTwoHundred;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> oldToNew = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.random = head;
        head.next.next = new Node(11);
        Node a = head.next.next;
        a.next = new Node(10);
        a.next.next = new Node(1);
        a.next.next.random = head;
        a.random = a.next.next;
        a.next.random = a;
        Node ans = copyRandomList(head);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
}
