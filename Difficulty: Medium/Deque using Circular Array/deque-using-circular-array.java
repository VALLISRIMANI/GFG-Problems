class myDeque {
    int[] deque;
    int front, size, capacity;
    
    public myDeque(int n) {
        // Initialize your data members
        deque = new int[n];
        front = 0;
        size = 0;
        capacity = n;
    }

    public void insertFront(int x) {
        // Insert element at the front
        if (size == capacity) return;
        front = (front - 1 + capacity) % capacity;
        deque[front] = x;
        size++;
    }

    public void insertRear(int x) {
        // Insert element at the rear
        if (size == capacity) return;
        int rear = (front + size) % capacity;
        deque[rear] = x;
        size++;
    }

    public void deleteFront() {
        // Delete element from the front
        if (size == 0) return;
        front = (front + 1) % capacity;
        size--;
    }

    public void deleteRear() {
        // Delete element from the rear
        if (size == 0) return;
        size--;
    }

    public int frontEle() {
        // Get the front element
        if (size == 0) return -1;

        return deque[front]; 
    }

    public int rearEle() {
        // Get the rear element
        if (size == 0) return -1;

        int rear = (front + size - 1) % capacity;
        return deque[rear]; 
    }
}