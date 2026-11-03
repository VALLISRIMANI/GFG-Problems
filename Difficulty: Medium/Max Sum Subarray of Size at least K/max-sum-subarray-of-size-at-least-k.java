class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
        int n = arr.length;
        int[] maxEndingHere = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxEndingHere[i] = sum;
        }
        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maximumSum = windowSum;
        
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maximumSum = Math.max(maximumSum, windowSum);
            maximumSum = Math.max(maximumSum, windowSum + maxEndingHere[i - k]);
        }
        
        return maximumSum;
    }   
}