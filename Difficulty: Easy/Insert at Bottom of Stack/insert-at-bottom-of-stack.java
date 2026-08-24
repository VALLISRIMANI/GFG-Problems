class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        while (!st.isEmpty()) {
            s.push(st.pop());
        }
        
        st.push(x);
        while (!s.isEmpty()) {
            st.push(s.pop());
        }
        
        return st;
    }
}