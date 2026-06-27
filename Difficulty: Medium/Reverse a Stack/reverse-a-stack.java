class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        
       st.addAll(temp);
    }
}
