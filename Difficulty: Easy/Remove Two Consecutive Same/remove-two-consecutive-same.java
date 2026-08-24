class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here
        Stack<String> st = new Stack<>();
        
        for (String str : arr) {
            if (st.isEmpty() || !st.peek().equals(str)) {
                st.push(str);
            } else {
                while (!st.isEmpty() && st.peek().equals(str)) st.pop();
            }
        }
        
        return st.size();
    }
};