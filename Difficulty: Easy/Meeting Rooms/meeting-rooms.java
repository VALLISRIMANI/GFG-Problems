class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr, (x, y) -> x[1] - y[1]);

        int result = 1, j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= arr[j][1]) {
                result++;
                j = i;
            }
        }

        return result == n;
    }
}