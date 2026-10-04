class Solution {
    public int countSubarrays(int[] arr, int l, int r) {
        // code here
        return (int) (countMaximumSubarrays(arr, r) - countMaximumSubarrays(arr, l - 1));
    }
    
    private long countMaximumSubarrays(int[] arr, int k) {
        long count = 0;
        long length = 0;
        
        for (int num : arr) {
            if (num <= k) {
                length++;
                count += length;
            } else {
                length = 0;
            }
        }
        
        return count;
    }
}