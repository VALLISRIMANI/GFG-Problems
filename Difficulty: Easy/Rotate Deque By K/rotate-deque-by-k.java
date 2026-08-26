class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        /* int n = dq.size();
        k = k % n;
        
        if (k == 0) return;
        
        List<Integer> temp = new ArrayList<>(dq);
        dq.clear();
        
        if (type == 1) {
            for (int i = n - k; i < n; i++) dq.addLast(temp.get(i));
            for (int i = 0; i < n - k; i++) dq.addLast(temp.get(i));
        } else {
            for (int i = k; i < n; i++) dq.addLast(temp.get(i));
            for (int i = 0; i < k; i++) dq.addLast(temp.get(i));
        } */
        
        int n = dq.size();
        k = k % n;
        
        if (k == 0) return;
        
        if (type == 1) {
            for (int i = 0; i < k; i++) {
                dq.addFirst(dq.removeLast());
            }
        } else {
            for (int i = 0; i < k; i++) {
                dq.addLast(dq.removeFirst());
            }
        }
    }
}