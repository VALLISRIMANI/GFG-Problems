class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[] board = new int[n];

        backtrack(0, n, board);

        return result;
    }
    
    private void backtrack(int row, int n, int[] board) {
        if (row == n) {
            ArrayList<Integer> solution = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                solution.add(board[i] + 1);
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row] = col;
                backtrack(row + 1, n, board);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] board) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousCol = board[previousRow];

            if (previousCol == col) {
                return false;
            }
            
            if (Math.abs(previousRow - row) == Math.abs(previousCol - col)) {
                return false;
            }
        }

        return true;
    }
}