class Solution {
    public int squaresInMatrix(int m, int n) {
        // code here
        int total = 0;
        int minSide = Math.min(m, n);

        for (int k = 1; k <= minSide; k++) {
           total += (m - k + 1) * (n - k + 1);
        }

        return total;
    }
};
