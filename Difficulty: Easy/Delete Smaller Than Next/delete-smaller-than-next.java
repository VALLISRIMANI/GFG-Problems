class Solution {
    public static ArrayList<Integer> deleteElement(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int count = 0;
        
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() < arr[i] && count < k) {
                st.pop();
                count++;
            }
            st.push(arr[i]);
        }
        
        while (!st.isEmpty()) {
            result.add(st.pop());
        }
        
        Collections.reverse(result);
        
        return result;
    }
}