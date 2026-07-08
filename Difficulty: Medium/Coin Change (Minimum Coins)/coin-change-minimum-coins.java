class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        /* if (sum == 0) return 0;
        
        Arrays.sort(coins);
        
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (coins[i] <= sum) {
                count++;
                sum -= coins[i];
            }
        }
        
        return sum == 0 ? count : -1;
        */
        
        int n = coins.length;
        int[] dp = new int[sum + 1];
        
        dp[0] = 0;
        
        for (int j = 1; j <= sum; j++) {
            dp[j] = Integer.MAX_VALUE;
        }
        
        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                if (dp[j - coin] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
                }
            }
        }
        
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}