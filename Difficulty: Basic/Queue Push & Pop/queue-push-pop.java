class Solution {
    public Queue<Integer> fillQ(int[] arr) {
        // code here
        Queue<Integer> queue = new LinkedList<>();
        
        for (int num : arr) {
            queue.offer(num);
        }
        
        return queue;
    }

    public void emptyQ(Queue<Integer> q) {
        // code here
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        
        System.out.println();
    }
}