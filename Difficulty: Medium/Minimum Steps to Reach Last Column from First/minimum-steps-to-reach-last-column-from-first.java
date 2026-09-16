class Solution {
    public int minSteps(int[][] mat) {
        // code here
        int n = mat.length;

        int[][] directions = {
            {-1, 0}, {0, -1}, {0, 1}, {1, 0}
        };

        Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < n; row++) {
            if (mat[row][0] == 0) {
                queue.offer(new int[]{row, 0, 0});
                mat[row][0] = 1;
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (col == n - 1) {
                return distance;
            }

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && mat[newRow][newCol] == 0) {
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                    mat[newRow][newCol] = 1;
                }
            }
        }

        return -1;
    }
}