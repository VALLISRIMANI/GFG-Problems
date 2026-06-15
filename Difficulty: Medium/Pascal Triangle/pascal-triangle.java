class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        long val = 1; 
        
        for (int k = 0; k < n; k++) {
            row.add((int)val);
            val = val * (n - 1 - k) / (k + 1);
        }
        
        return row;
    }
}