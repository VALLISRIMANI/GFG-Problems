class Solution {
    public int countWays(int n) {
        // code here
        int[] scores = {3, 5, 10};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for (int score : scores) {
            for (int i = score; i <= n; i++) {
                dp[i] += dp[i - score];
            }
        }
        
        return dp[n];
    }
}