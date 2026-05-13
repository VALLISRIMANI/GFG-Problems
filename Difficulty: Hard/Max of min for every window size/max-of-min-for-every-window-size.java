class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        int[] nse = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int[] pse = new int[n];
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int len = nse[i] - pse[i] - 1;
            if (res[len - 1] < arr[i]) {
                res[len - 1] = arr[i];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (res[i] < res[i + 1]) {
                res[i] = res[i + 1];
            }
        }

        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) result.add(res[i]);

        return result;
    }
}
