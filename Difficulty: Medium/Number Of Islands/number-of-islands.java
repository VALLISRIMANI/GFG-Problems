class Solution {

    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        // Your code here
        int[][] grid = new int[rows][cols];
        List<Integer> result = new ArrayList<>();
        
        for (int[] op : operators) {
            int r = op[0];
            int c = op[1];
            
            if (grid[r][c] == 1) {
                result.add(countIslands(grid, rows, cols));
                continue;
            }
            
            grid[r][c] = 1;
            result.add(countIslands(grid, rows, cols));
        }

        return result;
    }

    int countIslands(int[][] grid, int rows, int cols) {
        int[][] visited = new int[rows][cols];
        int count = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    dfs(i, j, rows, cols, grid, visited);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    void dfs(int i, int j, int m, int n, int[][] grid, int[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
    
        if (grid[i][j] == 0 || visited[i][j] == 1) {
            return;
        }
        
        visited[i][j] = 1;
        
        dfs(i, j - 1, m, n, grid, visited);
        dfs(i, j + 1, m, n, grid, visited);
        dfs(i - 1, j, m, n, grid, visited);
        dfs(i + 1, j, m, n, grid, visited);
    }
}