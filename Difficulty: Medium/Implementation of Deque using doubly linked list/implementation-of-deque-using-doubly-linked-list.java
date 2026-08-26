class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class myDeque {
    Node head;
    Node tail;
    
    myDeque() {
        // Initialize your data members
        head = null;
        tail = null;
    }

    void insertFront(int x) {
        // Insert element at the front
        Node newNode = new Node(x);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertRear(int x) {
        // Insert element at the rear
        Node newNode = new Node(x);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void deleteFront() {
        // Delete element from the front
        if (head == null) return;

        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
    }

    void deleteRear() {
        // Delete element from the rear
        if (tail == null) return;

        tail = tail.prev;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
    }

    int getFront() {
        // Get front element (-1 if empty)
        return head != null ? head.data : -1;
    }

    int getRear() {
        // Get rear element (-1 if empty)
        return tail != null ? tail.data : -1;
    }
}
