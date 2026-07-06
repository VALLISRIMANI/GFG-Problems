class Solution {
    public int countSquares(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(
                            dp[i - 1][j],
                            Math.min(dp[i][j - 1], dp[i - 1][j - 1])
                        ) + 1;
                    }
                    count += dp[i][j];
                }
            }
        }

        return count;
    }
}