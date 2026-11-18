class Solution {
    public int longestSubarray(int arr[]) {
        // code here
        int left = 0;
        int n = arr.length;
        int maxLen = 0;
        
        for (int right = 0; right < n; right++) {
            if (arr[right] < 0) {
                left = right + 1;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        return maxLen;
    }
}