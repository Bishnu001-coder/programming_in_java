package _8_DSA.Doubly_linked_list;

public class _1_print_doubly_LinkedList {
    public static void main(String[] args) {
        Doubly_linked_list ll=new Doubly_linked_list();
        ll._3_D_printll();
        ll._1_addfirst(1);
        ll._3_D_printll();
        ll._2_D_addlast(2);
        ll._3_D_printll();
        ll._1_addfirst(0);
        ll._3_D_printll();
        ll._2_D_addlast(3);
        ll._3_D_printll();
        System.out.println(ll.size);
    }

}
