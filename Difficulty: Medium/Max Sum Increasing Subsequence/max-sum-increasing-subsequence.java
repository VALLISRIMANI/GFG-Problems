class Solution {
    public int maxSumIS(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        int maxSum = dp[0];
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], arr[i] + dp[j]);
                }
            }
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }
}