class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for (int num : arr) {
            st.push(num);
        }
        int idx = 0;
        while (!st.isEmpty()) {
            arr[idx++] = st.pop();
        }
    }
}
