class Solution {
    long countStr(int n) {
        // code here
        if (n == 0) return 0;

        // dp[i][b][c] = number of strings of length i with at most b 'b's and c 'c's
        long[][][] dp = new long[n + 1][2 + 1][2 + 1];

        dp[0][0][0] = 1; // base case: empty string

        for (int i = 0; i < n; i++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 2; c++) {
                    long val = dp[i][b][c];
                    if (val == 0) continue;

                    // add 'a'
                    dp[i + 1][b][c] += val;

                    // add 'b' if not used yet
                    if (b < 1) dp[i + 1][b + 1][c] += val;

                    // add 'c' if less than 2 used
                    if (c < 2) dp[i + 1][b][c + 1] += val;
                }
            }
        }

        long total = 0;
        for (int b = 0; b <= 1; b++) {
            for (int c = 0; c <= 2; c++) {
                total += dp[n][b][c];
            }
        }

        return total;
    }
}