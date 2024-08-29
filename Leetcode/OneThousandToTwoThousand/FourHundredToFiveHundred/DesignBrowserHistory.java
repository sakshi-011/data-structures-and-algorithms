package Leetcode.OneThousandToTwoThousand.FourHundredToFiveHundred;

public class DesignBrowserHistory {

    public static class Node{
        String name;
        Node next;
        Node prev;

        Node(String name){
            this.name = name;
            prev = null;
            next = null;
        }
    }

    static Node browser;

    public DesignBrowserHistory(String homepage) {
        browser = new Node(homepage);
    }

    public static void visit(String url) {
        browser.next = new Node(url);
        Node prev = browser;
        browser = browser.next;
        browser.prev = prev;
    }

    public static String back(int steps) {
        while(browser.prev != null && steps>0){
            browser = browser.prev;
            steps--;
        }
        return browser.name;
    }

    public static String forward(int steps) {
        while(browser.next != null && steps>0){
            browser = browser.next;
            steps--;
        }
        return browser.name;
    }

    public static void main(String[] args) {
        DesignBrowserHistory b = new DesignBrowserHistory("leetcode.com");
        b.visit("google.com");
        b.visit("facebook.com");
        b.visit("youtube.com");
        System.out.println(b.back(1));
        System.out.println(b.back(1));
        System.out.println(b.forward(1));
        System.out.println(b.back(1));
        System.out.println(b.forward(1));
        b.visit("linkedin.com");
        System.out.println(b.forward(2));
        System.out.println(b.back(2));
        System.out.println(b.back(7));
    }

}
