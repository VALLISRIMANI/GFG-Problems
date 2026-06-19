class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            
            if (!st.isEmpty()) {
                result.add(0, st.peek());
            } else {
                result.add(0, -1);
            }
            
            st.push(arr[i]);
        }
        
        return result;
    }
}