// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    private Node head = null;
    private int count = 0;

    public boolean isEmpty() {
        // check if the stack is empty
        return head == null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if (head != null) {
            head = head.next;
            count--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        return head == null ? -1 : head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return count;
    }
}
