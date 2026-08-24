class Solution {
    public boolean pairWiseConsecutive(Stack<Integer> st) {
        // code here
        if (st.size() % 2 == 1) {
            st.pop();
        }
        
        while (!st.isEmpty()) {
            int num1 = st.pop(), num2 = st.pop();
            if (Math.abs(num1 - num2) != 1) {
                return false;
            }
        }
        
        return true;
    }
}