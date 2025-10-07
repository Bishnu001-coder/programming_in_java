package _8_DSA.Linked_list;

public class _9_delete_from_end_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(3);
        ll._2_addlast(4);
        ll._4_printll();
        ll._10_delete_from_end(2); // delete 2nd from end
        ll._4_printll();
    }
}
