package _8_DSA.STACKS.STACKUSING_ARRAYLIST;

import java.util.ArrayList;

public class STACK_USING_ARRAYLIST {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty() {
            return list.size() == 0;
        }

        public static void _1_push(int data) {
            list.add(data);
        }

        public static int _2_pop() {
            if (isempty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int _3_peek() {
            if (isempty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s._1_push(10);
        s._1_push(20);
        s._1_push(30);

        System.out.println("Top element: " + s._3_peek());
        System.out.println("Removed: " + s._2_pop());
        System.out.println("Top element after pop: " + s._3_peek());
    }
}
