package _8_DSA.Linked_list;

public class _3_add_middle_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(4);
        ll._4_printll();
        ll._3_addmiddle(2, 3); // add 3 at index 2
        ll._4_printll();
    }
}
