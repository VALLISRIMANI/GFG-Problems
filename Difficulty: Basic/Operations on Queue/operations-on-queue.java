class myQueue {
    Queue<Integer> queue;
    public myQueue() {
        // initialize your queue
        queue = new LinkedList<>();
    }

    public void enqueue(int x) {
        // insert x into queue
        queue.offer(x);
    }

    public void dequeue() {
        // remove front element from queue
        queue.poll();
    }

    public int getFront() {
        // return the front element of the queue
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public int getRear() {
        // return the rear element of the queue
        return queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast();
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        return queue.isEmpty();
    }

    public int size() {
        // return the size of the queue
        return queue.size();
    }
}
