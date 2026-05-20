class Solution {
    public int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr, int n) {
        // code here
        int min = Integer.MAX_VALUE;
        
        int maxCols = 0;
        for (ArrayList<Integer> row : arr) {
            maxCols = Math.max(maxCols, row.size());
        }
        
        for (int i = 0; i < maxCols; i++) {
            int sum = 0;
            for (ArrayList<Integer> row : arr) {
                if (i < row.size()) {
                    sum += row.get(i);
                }
            }
            min = Math.min(min, sum);
        }
        
        return min;
    }
}
