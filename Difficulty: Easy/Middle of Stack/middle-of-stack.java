class Solution {
    public int stackMiddle(Stack<Integer> st) {
        // code here
        int size = st.size();
        
        int middle = size / 2;
        
        for (int i = 0; i < middle; i++) {
            st.pop();
        }
        
        return st.pop();
    }
}