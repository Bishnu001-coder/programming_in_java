package _8_DSA.Linked_list;

public class _7_recursive_search_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(3);
        System.out.println("Search 2 recursively: " + ll._8_recursive_search(ll.head, 2, 0));
        System.out.println("Search 5 recursively: " + ll._8_recursive_search(ll.head, 5, 0));
    }
}
