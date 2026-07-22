class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k %= n;
        
        int[] result = new int[n];
        int idx = 0;
        
        for (int i = n - k; i < n; i++) {
            result[idx++] = arr[i];
        }
        
        for (int i = 0; i < n - k; i++) {
            result[idx++] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}