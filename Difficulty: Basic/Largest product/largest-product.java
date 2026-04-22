/*You are required to complete the function*/
class Solution {
    public int findMaxProduct(int[] arr, int k) {
        // code here
        if (k > arr.length) return 0;
        
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int product = 1;
            
            for (int j = i; j < i + k; j++) {
                product *= arr[j];
            }
            
            maxProduct = Math.max(maxProduct, product);
        }
        
        return maxProduct;
    }
}