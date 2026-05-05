class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        
        return q;
    }
}