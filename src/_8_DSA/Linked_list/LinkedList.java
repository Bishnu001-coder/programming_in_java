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
    public Object _5_removefirst() {
        if (head == null) return null;
        Object val = head.ele;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return val;
    }
    public Object _6_removelast() {
        if (head == null) return null;
        if (head == tail) {
            Object val = head.ele;
            head = tail = null;
            size--;
            return val;
        }
        Node curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }
        Object val = tail.ele;
        curr.next = null;
        tail = curr;
        size--;
        return val;

    }
    public Integer _7_search_iterative(Object key) {
        Node curr = head;
        int i = 0;
        while (curr != null) {
            if (curr.ele.equals(key)) return i;
            curr = curr.next;
            i++;
        }
        return null;
    }
    // Search recursive
    public Integer _8_recursive_search(Node curr, Object key, int idx) {
        if (curr == null) return null;
        if (curr.ele.equals(key)) return idx;
        return _8_recursive_search(curr.next, key, idx + 1);
    }
    public void _9_reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        tail = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
