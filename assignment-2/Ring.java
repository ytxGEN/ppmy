public class Ring<T> implements RingInterface<T> {

    private Node<T> current;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<E> {
        public E data;
        public Node<E> next;
    
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }


    /** moves the reference to the next node in the collection */
    @Override
    public void advance() {
        if (current != null) {
            current = current.next;
        }
    }


    /**
     * Retrieves the current element in the ring
     * 
     * @return the current element in the ring
     */
    @Override
    public T getCurrent() {
        return current.data;
    }

    /**
     * Add new element to the ring
     * @param node the new element to be added
     */
    @Override
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            newNode.next = head;
        } else {
            newNode.next = current.next;
            current.next = newNode;
            if (current == tail) {
                tail = newNode;
            }
        }
    }


    /**
     * Remove the current element from the ring
     */
    @Override
    public void remove() {
        if (current == null) {
            return;
        }

        // if there is only one element in the ring
        if (head == current && tail == current) {
            head = null;
            tail = null;
            current = null;
            return;
        }

        // if current is head
        if (current == head) {
            head = head.next;
            tail.next = head;
            current = head;
            return;
        }

        // find the node before the current node
        Node<T> temp = head;
        while (temp.next != current) {
            temp = temp.next;
        }
        temp.next = current.next;
        if (current == tail) { // Current is tail
            tail = temp;
        }
        current = temp.next;
    }

    /**
     * Prints all elements in the list from first to last.
     */
    public void display() {
        if (head != null) {
            Node<T> temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("..");
        }
    }
}
