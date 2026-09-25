class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i < n / 2; i++) {
            q1.offer(q.poll());
        }
        
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = n / 2; i < n; i++) {
            q2.offer(q.poll());
        }
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            q.offer(q1.poll());
            q.offer(q2.poll());
        }
    }
}
