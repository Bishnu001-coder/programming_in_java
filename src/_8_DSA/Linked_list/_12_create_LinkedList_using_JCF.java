package _8_DSA.Linked_list;
import java.util.LinkedList;
public class _12_create_LinkedList_using_JCF {
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll.getLast());
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }


}
