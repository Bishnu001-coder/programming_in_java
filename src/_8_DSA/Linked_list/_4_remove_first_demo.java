package _8_DSA.Linked_list;

public class _4_remove_first_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(3);
        ll._4_printll();
        System.out.println("Removed: " + ll._5_removefirst());
        ll._4_printll();

    }
}
