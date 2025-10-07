package _8_DSA.Linked_list;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void _1_addfirst(Object ele) {
        Node newNode = new Node(ele);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void _2_addlast(Object ele) {
        Node newNode = new Node(ele);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void _3_printll() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.ele + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

}
