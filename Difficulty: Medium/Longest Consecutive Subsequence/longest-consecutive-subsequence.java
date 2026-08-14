class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int maxLen = 1, current_streak = 1; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            
            if (arr[i] == arr[i - 1] + 1) {
                current_streak++;
            } else {
                maxLen = Math.max(maxLen, current_streak);
                current_streak = 1;
            }
        }
        
        return Math.max(maxLen, current_streak);
    }
}