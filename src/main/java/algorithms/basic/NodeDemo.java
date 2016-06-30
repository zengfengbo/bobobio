package algorithms.basic;

/**
 * Created by fb on 16/6/19.
 */
public class NodeDemo {
    public static void main(String[] args) {
        System.out.println("test");
        Node<Integer> first = new Node<Integer>();
        Node<Integer> second = new Node<Integer>();
        Node<Integer> third = new Node<Integer>();

        first.item = 1;
        second.item = 2;
        third.item = 3;
        first.next = second;
        third.next = first;
        second.next = third;

        System.out.println(second);
    }

    private static class Node<Item> {
        Item item;
        Node next;
        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }
}
