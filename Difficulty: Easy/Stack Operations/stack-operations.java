class myStack {
    // Define your stack
    Stack<Integer> st;
    
    public myStack() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        // insert x into stack
        st.push(x);
    }

    public void pop() {
        // remove top ele from stack
        if (!st.isEmpty()) st.pop();
    }

    public int peek() {
        // return top of stack
        if (!st.isEmpty()) return st.peek();
        
        return -1;
    }

    public int getSize() {
        // return current size of stack
        return st.size();
    }

    public boolean isEmpty() {
        // check whether stack is empty
        return st.isEmpty();
    }
}
