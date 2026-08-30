class kQueues {
    int[] arr, front, rear, next;
    int freeSpot;
    
    kQueues(int n, int k) {
        // Initialize your data members
        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        
        next = new int[n];
        
        Arrays.fill(front, -1);
        Arrays.fill(rear, -1);
        
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        
        next[n - 1] = -1;
        freeSpot = 0;
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        if (isFull()) return;
        
        int idx = freeSpot;
        freeSpot = next[idx];
    
        arr[idx] = x;
        
        if (front[i] == -1) {
            front[i] = idx;
        } else {
            next[rear[i]] = idx;
        }
        
        rear[i] = idx;
        next[idx] = -1;
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if (isEmpty(i)) return -1;
        
        int idx = front[i];
        front[i] = next[idx];
        
        if (front[i] == -1) rear[i] = -1;
        
        next[idx] = freeSpot;
        freeSpot = idx;
        
        return arr[idx];
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        return front[i] == -1;
    }

    boolean isFull() {
        // check if array is full
        return freeSpot == -1;
    }
}
