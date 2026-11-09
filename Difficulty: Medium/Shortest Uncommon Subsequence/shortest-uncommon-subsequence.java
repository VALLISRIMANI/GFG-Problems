class Solution {
    public int shortestUnSub(String s, String t) {
        // code here       
        int n = s.length();
        int m = t.length();

        int[][] next = new int[m + 1][26];

        for (int c = 0; c < 26; c++) {
            next[m][c] = -1;
        }

        for (int j = m - 1; j >= 0; j--) {

            for (int c = 0; c < 26; c++) {
                next[j][c] = next[j + 1][c];
            }

            next[j][t.charAt(j) - 'a'] = j;
        }

        int[] dp = new int[m + 1];

        for (int j = 0; j <= m; j++) {
            dp[j] = 100000;
        }

        for (int i = n - 1; i >= 0; i--) {

            int[] curr = new int[m + 1];

            curr[m] = 1;

            for (int j = m - 1; j >= 0; j--) {

                int k = next[j][s.charAt(i) - 'a'];

                if (k == -1) {
                    curr[j] = 1;
                } else {
                    curr[j] = Math.min(
                        dp[j],
                        1 + dp[k + 1]
                    );
                }
            }

            dp = curr;
        }

        return dp[0] >= 100000 ? -1 : dp[0];
    }
}