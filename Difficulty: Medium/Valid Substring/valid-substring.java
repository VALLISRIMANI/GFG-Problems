class Solution {
    public int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        int maxLen = 0;
        
        for (int idx = 0; idx <s.length(); idx++) {
            char ch = s.charAt(idx);
            
            if (ch == '(') {
                st.push(idx);
            } else {
                st.pop();
                
                if (st.isEmpty()) {
                    st.push(idx);
                } else {
                    maxLen = Math.max(maxLen, idx - st.peek());
                }
            }
        }
        
        return maxLen;
    }
}