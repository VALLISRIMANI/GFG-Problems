class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
        if (k <= 1) return 0;
        
        int prod = 1, count = 0, left = 0;
        
        for (int right = 0; right < arr.length; right++) {
            prod *= arr[right];
            
            while (prod >= k) {
                prod /= arr[left];
                left++;
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }
}