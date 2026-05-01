class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int left = 0, maxLen = 0;
        int[] freq = new int[256]; 

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq[c]++;
            
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}