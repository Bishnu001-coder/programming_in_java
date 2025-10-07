package _8_DSA.Linked_list;

public class _5_remove_last_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(3);
        ll._4_printll();
        System.out.println("Removed: " + ll._6_removelast());
        ll._4_printll();
    }
}
