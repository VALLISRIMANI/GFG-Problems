class Solution {
    /* public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < queries.length; i++) {
            result.add(mean(arr, queries[i][0], queries[i][1]));
        }
        
        return result;
    }
    
    public int mean(int[] arr, int left, int right) {
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }
        
        return (int)Math.floor(sum / (right - left + 1)); 
    } */
    
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        
        ArrayList<Integer> result = new ArrayList<>();
    
        int n = arr.length;
        long[] prefix = new long[n + 1];
    
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
    
        for (int[] q : queries) {
            int left = q[0];
            int right = q[1];
    
            long sum = prefix[right + 1] - prefix[left];
            int count = right - left + 1;
    
            result.add((int)(sum / count));
        }
    
        return result;
    }
}