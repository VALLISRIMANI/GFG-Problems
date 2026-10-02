class Solution {
    public String removeKdig(String s, int k) {
        // code here
        int n = s.length();
        if (k >= n) return "0";
        
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            
            st.push(ch);
        }
        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        int index = 0;
        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
        String result = sb.substring(index);
        
        return result.isEmpty() ? "0" : result;
    }
}