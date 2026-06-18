class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq = new LinkedList<>();
        
        for (int num : arr) {
            dq.offer(num);
        }
        
        return dq;
    }
}