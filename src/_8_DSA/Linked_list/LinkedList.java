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

    public void _3_addmiddle(int index, Object ele) {
        if (index == 0) {
            _1_addfirst(ele);
            return;
        }
        Node newNode = new Node(ele);
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void _4_printll() {
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
