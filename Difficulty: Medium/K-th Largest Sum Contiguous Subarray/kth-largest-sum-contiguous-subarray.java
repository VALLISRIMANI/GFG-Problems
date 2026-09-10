class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int currentSum = prefixSum[j] - prefixSum[i - 1];
                
                if (minHeap.size() < k) {
                    minHeap.add(currentSum);
                } else if (currentSum > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(currentSum);
                }
            }
        }
        
        return minHeap.peek();
    }
}
