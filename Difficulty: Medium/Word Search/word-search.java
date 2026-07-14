class Solution {
    final static int[][] dir = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };
    
    public static boolean wordSearch(char mat[][], String word) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(mat, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean dfs(char[][] mat, String word, int i, int j, int idx) {
        if (idx == word.length()) return true;
        
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) return false;
        
        if (mat[i][j] != word.charAt(idx)) return false;
        
        char temp = mat[i][j];
        mat[i][j] = '#';
        
        for (int[] d : dir) {
            int r = i + d[0];
            int c = j + d[1];
            
            if (dfs(mat, word, r, c, idx + 1)) {
                return true;
            }
        }
        
        mat[i][j] = temp;
        
        return false;
    }
}