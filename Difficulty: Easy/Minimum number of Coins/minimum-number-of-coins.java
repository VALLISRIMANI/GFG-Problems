class Solution {
    public int findMin(int n) {
        // code here
        /* 
        
        int minCoins = 0;
        while (n > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (n / coins[i] >= 0) {
                    minCoins += n / coins[i];
                    n %= coins[i];
                }
            }
        }
        
        return minCoins;
        */
        
        /*
        int minCoins = 0;
        
        if (n >= 10) {
            minCoins += n / 10;
            n %= 10;
        }
        
        if (n >= 5){
            minCoins += n / 5;
            n %= 5;
        }
        
        if(n >= 2){
            minCoins += n / 2;
            n %= 2;
        }
        
        if(n == 1) minCoins++;
        
        return minCoins;
        */
        
        int[] coins = {10, 5, 2, 1};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}
