class Solution {
    public int countSubarray(int[] arr, int l, int r) {
        // code here
        return countSubarraysWithSumAtMost(arr, r) - countSubarraysWithSumAtMost(arr, l - 1);
    }
    
    public int countSubarraysWithSumAtMost(int[] arr, int K) {
        if (K < 0) return 0;
        
        int left = 0, currentSum = 0, count = 0;
        
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            
            while (left <= right && currentSum > K) {
                currentSum -= arr[left++];
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }
}