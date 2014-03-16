package stack;

/**
 * Stack implementation on liked list.
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class LinkedStack extends AbstractStack {
    private Node head;

    public void push(Object element) {
        head = new Node(element, head);
        size++;
    }

    public Object peek() {
        assert size != 0;
        return head.value;
    }

    public Object pop() {
        assert size != 0;
        Object res = head.value;
        head = head.next;
        size--;
        return res;
    }

    private static class Node {
        private final Object value;
        private final Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
