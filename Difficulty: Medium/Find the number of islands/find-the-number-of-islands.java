class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'L') {
                    dfs(i, j, m, n, grid);
                    result++;
                }
            }
        }

        return result;
    }

    private static void dfs(int i, int j, int m, int n, char[][] grid) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (grid[i][j] == 'L') {
            grid[i][j] = '#';
            dfs(i, j - 1, m, n, grid);
            dfs(i, j + 1, m, n, grid);
            dfs(i - 1, j, m, n, grid);
            dfs(i + 1, j, m, n, grid);
            dfs(i - 1, j - 1, m, n, grid);
            dfs(i + 1, j + 1, m, n, grid);
            dfs(i - 1, j + 1, m, n, grid);
            dfs(i + 1, j - 1, m, n, grid);
        }
    }
}