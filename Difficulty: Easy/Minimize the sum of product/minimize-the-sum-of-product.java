class Solution {
    public int minProductSum(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int n = a.length, product = 0;
        for (int i = 0; i < n; i++) {
            product += a[i] * b[n - 1 - i];
        }
        
        return product;
    }
}