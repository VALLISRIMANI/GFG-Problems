class myQueue {
    private int[] queue;
    int size, idxFront, idxRear, count;
    
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        queue = new int[n];
        size = n;
        idxFront = 0;
        idxRear = 0;
        count = 0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return count == 0;
    }

    public boolean isFull() {
        // Check if queue is full
        return count == size;
    }

    public void enqueue(int x) {
        // Enqueue
        if (isFull()) return;
        queue[idxRear] = x;
        idxRear = (idxRear + 1) % size;
        count++;
    }

    public void dequeue() {
        // Dequeue
        if (isEmpty()) return;
        idxFront = (idxFront + 1) % size;
        count--;
    }

    public int getFront() {
        // Get front element
        return isEmpty() ? -1 : queue[idxFront];
    }

    public int getRear() {
        // Get last element
        return isEmpty() ? -1 : queue[(idxRear - 1 + size) % size];
    }
}
