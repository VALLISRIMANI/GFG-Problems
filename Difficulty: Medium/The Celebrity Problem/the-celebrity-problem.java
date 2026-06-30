class Solution {
    public int celebrity(int mat[][]) {
        // code here
        /* int n = mat.length;
        int a = 0, b = n - 1;
        
        while(a < b) {
            if(mat[a][b] == 1) a++;
            else b--;
        }
        
        for(int i = 0; i < n; i++) {
            if(i != a && (mat[a][i] == 1 || mat[i][a] == 0)) return -1;
        }
        
        return a;
        */
        
        int n = mat.length;
        int[] in = new int[n];
        int[] out = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && i != j) {
                    in[j]++;
                    out[i]++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (in[i] == n - 1 && out[i] == 0) {
                return i;
            }
        }
        
        return -1;
    }
}