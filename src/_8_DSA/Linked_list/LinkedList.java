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

    public void _4_addmiddle(int index, Object ele) {
        if (index == 0) {
            _1_addfirst(ele);
            return;
        }
        Node newNode = new Node(ele);
        size++;
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public Object _5_removefirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return null;
        } else if (size == 1) {
            Object val = head.ele;
            head = tail = null;
            size--;
            return val;
        }
        Object val = head.ele;
        head = head.next;
        size--;
        return val;
    }

    public Object _6_removelast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return null;
        } else if (size == 1) {
            Object val = head.ele;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        Object val = prev.next.ele;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public Object _7_search_interative(Object key) {
        Node curr = head;
        int i = 0;
        while (curr != null) {
            if (curr.ele.equals(key)) {
                return i;
            }
            curr = curr.next;
            i++;
        }
        return null;
    }

    public Object _8_recurrsive_search(Node curr, Object key, int idx) {
        if (curr == null)
            return null;
        else if (curr.ele.equals(key))
            return idx;
        return _8_recurrsive_search(curr.next, key, idx + 1);
    }

    public void _9_reversell() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    public void _10_delete_from_end(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            _5_removefirst();
            return;
        }
        int i = 1;
        int ifindto = sz - n;
        Node prev = head;
        while (i < ifindto) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
}
