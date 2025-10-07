package _8_DSA.Linked_list;

public class _6_search_demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll._2_addlast(1);
        ll._2_addlast(2);
        ll._2_addlast(3);
        System.out.println("Search 2: " + ll._7_search_iterative(2));
        System.out.println("Search 5: " + ll._7_search_iterative(5));
    }
}
