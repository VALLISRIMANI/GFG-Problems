class Solution {
    public int findK(int[][] mat, int k) {
        // code here
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length -1;
        int count = 0;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  {
                count++;
                if (count == k) return mat[top][j];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) return mat[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    count++;
                    if (count == k) return mat[bottom][j];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) return mat[i][left];
                }
                left++;
            }
        }

        return -1;
    }
}