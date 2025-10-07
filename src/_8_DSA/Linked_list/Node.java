package _8_DSA.Linked_list;

public class Node {
    Object ele;
    Node next;

    public Node(Object ele, Node n) {
        this.ele = ele;
        this.next = n;
    }

    public Node(Object ele) {
        this.ele = ele;
        this.next = null;
    }
}
