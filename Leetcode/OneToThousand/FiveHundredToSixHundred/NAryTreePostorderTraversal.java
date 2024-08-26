package Leetcode.OneToThousand.FiveHundredToSixHundred;

import Leetcode.Node;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class NAryTreePostorderTraversal {

    public static List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            ans.add(curr.val);
            if(curr.children != null)
                for (Node child : curr.children)
                    stack.add(child);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        List<Node> children = new ArrayList<>();
        List<Node> c1 = new ArrayList<>();
        c1.add(new Node(5));
        c1.add(new Node(6));
        children.add(new Node(3, c1));
        children.add(new Node(2));
        children.add(new Node(4));
        Node root = new Node(1,children);

        List<Integer> list = postorder(root);
        for(int x : list)
            System.out.print(x+",");
    }
}
