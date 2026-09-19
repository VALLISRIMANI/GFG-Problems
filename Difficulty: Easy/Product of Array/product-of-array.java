class Solution {
    public long product(long arr[]) {
        // code here
        long mod = 1000000007L;
        long result = 1;
        
        for (int i = 0; i < arr.length; i++) {
            result = (result * (arr[i] % mod)) % mod;
        }
        
        return result;
    }
}