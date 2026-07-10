class Solution {

    private static final long MOD = 1_000_000_007;
    
    static long topDown(int n) {
        // code here
        long[] temp = new long[n + 1];
        Arrays.fill(temp, -1);
        return fib(n, temp);
    }
    
    static long fib(int n, long[] temp) {
        if (n <= 1) {
            return n;
        }
        
        if (temp[n] != -1) {
            return temp[n];
        }
        
        temp[n] = (fib(n - 1, temp) % MOD + fib(n - 2, temp) % MOD) % MOD;
        
        return temp[n];
    }

    static long bottomUp(int n) {
        // code here
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % MOD;
        } 
        
        return dp[n];
    }
}
