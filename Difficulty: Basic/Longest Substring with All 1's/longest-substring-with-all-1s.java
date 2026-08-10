class Solution {
    public int longestSubstring(String s) {
        // code here
        int maxLen = Integer.MIN_VALUE;
        
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != '1') {
                maxLen = Math.max(maxLen, right - left);
                left = right + 1;
            }
        }
                
        maxLen = Math.max(maxLen, s.length() - left);
        
        return maxLen;
    }
}