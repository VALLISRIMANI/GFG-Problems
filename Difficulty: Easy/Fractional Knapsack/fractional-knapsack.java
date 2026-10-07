class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        
        int[][] items = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }
        
        Arrays.sort(items, (a, b) -> 
            Double.compare(
                    (double) b[0] / b [1], 
                    (double) a[0] / a[1]
            )
        );
        
        double total = 0.0;
        
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                total += items[i][0];
                capacity -= items[i][1];
            } else {
                total += (double) items[i][0] / items[i][1] * capacity;
                break;
            }
        }
        
        return total;
    }
}