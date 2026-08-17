class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int[][] matrix = new int[n][m];
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int idx = 0;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  matrix[top][j] = arr[idx++];
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = arr[idx++];
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) matrix[bottom][j] = arr[idx++];
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = arr[idx++];
                left++;
            }
        }

        return matrix;
    }
}
