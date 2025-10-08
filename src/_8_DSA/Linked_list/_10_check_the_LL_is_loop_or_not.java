package _8_DSA.Linked_list;

public class _10_check_the_LL_is_loop_or_not {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=ll.head;
        System.out.println(ll._11_iscycle());
    }
}
