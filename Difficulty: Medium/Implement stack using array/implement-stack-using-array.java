class myStack {
    int[] stack;
    int i;
    public myStack(int n) {
        // Define Data Structures
        stack = new int[n];
        i = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return i < 0;
    }

    public boolean isFull() {
        // check if the stack is full
        return i == stack.length - 1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (!isFull()) {
            stack[++i] = x;
        }
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (!isEmpty()) {
            i--;
        }
    }

    public int peek() {
        // Returns the top element of the stack
        return !isEmpty() ? stack[i] : -1;
    }
}