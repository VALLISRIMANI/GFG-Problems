class Solution {
    public int maxSubarrSum(int[] arr, int a, int b) {
        // code here
        int n = arr.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int maxSum = Integer.MIN_VALUE;

        for (int i = a; i <= n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - b) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && prefix[dq.peekLast()] >= prefix[i - a]) {
                dq.pollLast();
            }
            dq.offerLast(i - a);
            maxSum = Math.max(maxSum, (int)(prefix[i] - prefix[dq.peekFirst()]));
        }

        return maxSum;
    }
}