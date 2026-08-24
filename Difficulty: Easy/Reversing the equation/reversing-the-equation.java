class Solution {

    String reverseEqn(String S) {
        // your code here
        Stack<String> st = new Stack<>();
        StringBuilder temp = new StringBuilder();
        
        int i = 0;
        
        while (i < S.length()) {
            char ch = S.charAt(i);
            
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                st.push(temp.toString());
                temp.setLength(0);
                st.push(String.valueOf(ch));
            } else {
                temp.append(ch);
            }
            
            i++;
        }
        
        st.push(temp.toString());
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}