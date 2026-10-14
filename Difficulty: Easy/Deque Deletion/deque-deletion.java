class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
        Iterator<Integer> it = deq.iterator();

        for (int i = 0; i <= x; i++) {
            it.next();
        }
        it.remove();
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
        if (start == end) return;

        Iterator<Integer> it = deq.iterator();
        int idx = 0;

        while (it.hasNext()) {
            it.next();

            if (idx >= start && idx < end) {
                it.remove();
            }
            idx++;
        }
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}