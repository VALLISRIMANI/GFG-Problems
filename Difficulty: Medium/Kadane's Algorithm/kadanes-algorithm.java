class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0], sum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i] + sum, arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
