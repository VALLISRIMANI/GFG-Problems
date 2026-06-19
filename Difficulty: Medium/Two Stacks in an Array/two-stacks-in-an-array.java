class twoStacks {
    int[] arr;
    int idx1, idx2;
    
    twoStacks() {
        arr = new int[100];
        idx1 = -1;
        idx2 = 100;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if (idx1 + 1 == idx2) return;
        arr[++idx1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if (idx1 == idx2 - 1) return;
        arr[--idx2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if (idx1 == -1) return -1;
        return arr[idx1--];
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if (idx2 == 100) return -1;
        return arr[idx2++];
    }
}