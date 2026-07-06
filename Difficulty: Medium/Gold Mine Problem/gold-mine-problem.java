class Solution {
    public int maxGold(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = mat[i][n - 1];
        }

        for (int col = n - 2; col >= 0; col--) {
            for (int row = 0; row < m; row++) {
                int right = dp[row][col + 1];
                int rightUp = (row > 0) ? dp[row - 1][col + 1] : 0;
                int rightDown = (row < m - 1) ? dp[row + 1][col + 1] : 0;

                dp[row][col] = mat[row][col]
                        + Math.max(right, Math.max(rightUp, rightDown));
            }
        }

        int maxGold = 0;
        for (int row = 0; row < m; row++) {
            maxGold = Math.max(maxGold, dp[row][0]);
        }

        return maxGold;
    }
}