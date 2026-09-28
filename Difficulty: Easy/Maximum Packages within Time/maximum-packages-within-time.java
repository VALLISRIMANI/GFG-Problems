class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        // code here
        int k = Math.min(totalTime, arr.length);
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        int maxSum = sum;
        
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}